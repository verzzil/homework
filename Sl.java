public class Sl {

    public static void main(String[] args) {

        int[][] mas = {
                {2,3,5,7,9,753},
                {1,10,11,16,19,50,61,589,669,1025},
                {3,4,6,8,13,58,235}
        };
        int[] pointer = new int[mas.length];
        int[] res = new int[getLength(mas)];

        int i = 0, counterForMin = 0, replaceIndex = 0;
        int mini = mas[0][0];

        while(i < res.length) {
            while (counterForMin < mas.length) {
                if(pointer[counterForMin] < mas[counterForMin].length && mas[counterForMin][pointer[counterForMin]] < mini) {
                    mini = mas[counterForMin][pointer[counterForMin]];
                    replaceIndex = counterForMin;
                }
                counterForMin++;
            }
            counterForMin = 0;
            pointer[replaceIndex]++;
            res[i++] = mini;

            mini = Integer.MAX_VALUE;
        }
    }

    public static boolean checkDim(int[][] mas, int[] pointer){
        for(int i = 0; i < mas.length; i++){
            if(mas[i].length != pointer[i]) return false;
        }
        return true;
    }

    public static void writeMas(int[] res){
        for(int z = 0; z < res.length; z++){
            System.out.print(res[z]+" ");
        }
        System.out.println();
    }
    public static int getLength(int[][] mas){
        int sum = 0;
        for(int i = 0; i < mas.length; i++){
            sum += mas[i].length;
        }
        return sum;
    }
}