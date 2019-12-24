import java.math.BigInteger;
import java.util.Scanner;

public class ACMP {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//        int k = scan.nextInt(),n = scan.nextInt();
////
////        BigInteger[] mas = new BigInteger[k];
////        mas[0] = BigInteger.valueOf(1);
////        for(int i = 1; i<k; i++){
////            mas[i] = sum(mas,i).add(BigInteger.valueOf(1));
////        }
////
////        System.out.println();
////        for(int i = k; i<n; i++){
////            mas[i%k] = sum(mas,k);
////        }
////        System.out.println(mas[(n-1)%k]);

//        BigAlbaInteger a = new BigAlbaInteger("10");
//        BigAlbaInteger b = new BigAlbaInteger("40");
//        BigAlbaInteger c = a.add(b);
//        BigAlbaInteger.write(c);

//        ComplexNumbers a = new ComplexNumbers(6.0,6.8);
//        ComplexNumbers b = new ComplexNumbers(0, 0.2);
//
//        ComplexNumbers c = a.addition(b,"-");
//        c.writeComplex();


    }

    public static int countOfSpaces(String str){
        int count = 0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==' ') count++;
        }
        return count;
    }
    public static int maxOfTwo(int a, int b){
        if(a>b) return a;
        else return b;
    }
    public static int[] readMas(String str){
        int[] mas = new int[countOfSpaces(str)+1];
        int sub = 0, i=0;
        for(int j = 0; j<str.length();j++){
            if(str.charAt(j) != ' ' && j !=str.length()-1) {
                sub = (sub+(int)str.charAt(j)-'0')*10;
            }
            else{
                if(j ==str.length()-1){
                    mas[i] = sub + (int)str.charAt(j)-'0';
                }
                else {
                    mas[i] = sub / 10;
                    sub = 0;
                    i++;
                }
            }
        }
        return mas;
    }
    public static void writeMas(int[] mas){
        for(int i = 0; i<mas.length;i++){
            System.out.print(mas[i]+" ");
        }
    }



    public static BigInteger sum(BigInteger[] mas,int z){
        BigInteger sum = BigInteger.valueOf(0);
        for(int i =0; i<z; i++){
            sum= sum.add(mas[i]);
        }
        return sum;
    }

    public static int volosi(Scanner scan){
        int n = scan.nextInt(),sum=0,max=0;
        scan.nextLine();
        String str = scan.nextLine();
//        int[] mas = readMas(str); СВОЙ СПОСОБ
        int[] mas = getIntMas(str.split(" "));
        for(int i = n-1; i>=0;i--){
            max = maxOfTwo(max,mas[i]);
            System.out.println(max);
            sum+=max;
        }

        return sum;
    }
    public static int[] getIntMas(String[] mass){
        int[] mas = new int[mass.length];
        for(int i=0; i<mas.length; i++) mas[i] = Integer.parseInt(mass[i]);
        return mas;
    }



}
