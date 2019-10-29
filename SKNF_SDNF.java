import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        String str = scan.nextLine(); // ВВОДИМ ВЕКТОР ЗНАЧЕНИЙ ФУНКЦИИ ТИПА F(10010101) вводить в одну строчку
        String[] symbols = new String[]{"x","y","z","r","g","b","x̄","ȳ","z̄","r̄","ḡ","b̄"};
        int numberOfColums = scan.nextInt(); // ВВОДИМ КОЛ-ВА ПЕРЕМЕННЫХ И, ОДНОВРЕМЕННО, КОЛ-ВА СТОЛБЦОВ (ГАРАНТИРОВАНА КОРРЕКСТНОСТЬ :) )
        int numberOfLines = (int)Math.pow(2,numberOfColums); // КОЛ-ВО СТРОК В МАТРИЦЕ
        String[][] truthTable = new String[numberOfLines][numberOfColums]; // ТАБЛИЦА ИСТИННОСТИ
        String[] functionValues = str.split(""); // ЗНАЧЕНИЯ ФУНКЦИИ, РАЗДЕЛЕННЫЕ НА МАССИВ
        String result = ""; // ИТОГОВАЯ СТРОКА


        getTruthTable(numberOfColums,numberOfLines,truthTable);


        System.out.println("СКНФ: "+getSKNF(functionValues,truthTable,symbols,numberOfColums,result));
        System.out.println("СДНФ: "+getSDNF(functionValues,truthTable,symbols,numberOfColums,result));

//        writeArray(numberOfLines,numberOfColums,truthTable);  ВЫВОДИТ ТАБЛИЦУ ИСТИННОСТИ

    }

    // СДНФ и СКНФ
    public static void getTruthTable(int colums, int lines, String[][] mas){
        for(int i = 0; i<colums; i++){
            for(int j = 0; j<lines; j++){
                if((j+1)%((int)Math.pow(2,colums-i)) <= ((int)Math.pow(2,colums-i))/2 && (j+1)%((int)Math.pow(2,colums-i)) != 0 ){
                    mas[j][i] = "0";
                }
                else{
                    mas[j][i] = "1";
                }
            }
        }
    }
    public static String getSDNF(String[] funcValues, String[][] trTable, String[] symb, int colums , String res){
        for(int i=0; i<funcValues.length; i++){
            for(int j=0;funcValues[i].equals("1") && j < colums;j++){
                res += trTable[i][j].equals("0") ? symb[j+6] : symb[j];
                if(j == colums-1){
                    res += " v ";
                }
            }
        }
        return res.substring(0,res.length()-3);
    }
    public static String getSKNF(String[] funcValues, String[][] trTable, String[] symb, int colums , String res){
        int k = 1;
        for(int i=0; i<funcValues.length; i++){
            for(int j=0;funcValues[i].equals("0") && j < colums;j++){
                if(k==1){
                    res+="(";
                    k=0;
                }
                res += trTable[i][j].equals("1") ? symb[j+6] : symb[j];
                if(j == colums-1){
                    res += ") ∧ ";
                }
                else{
                    res += " v ";
                }
            }
            k=1;
        }
        return res.substring(0,res.length()-3);
    }
    public static void writeArray(int n ,int l, String[][] m){
        for(int i =0; i <n;i++){
            for(int j=0; j<l; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
    
}
