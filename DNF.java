import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNF {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String[] symbols = new String[]{"a","y","o","u","e","b","á","ý","ó","ú","é","b̄"};
        int numberOfColums = scan.nextInt();
        int numberOfLines = (int)Math.pow(2,numberOfColums);
        String[][] truthTable = new String[numberOfLines][numberOfColums];
        String[] functionValues = str.split("");
        String result = "";

        System.out.println(str.length());




        //System.out.println("СКНФ: "+getSKNF(functionValues,truthTable,symbols,numberOfColums,result));
//        System.out.println("СДНФ: "+getSDNF(functionValues,truthTable,symbols,numberOfColums,result));

        getTruthTable(numberOfColums,numberOfLines,truthTable);

        List sdnf = getSDNF(functionValues,truthTable,symbols,numberOfColums,result);
        System.out.println("Совершенная ДНФ: "+sdnf);

        List sokrDNF = getSokrDNF(sdnf,symbols);
        sokrDNF = removeEquals(sokrDNF);
        System.out.println("Сокращенная ДНФ: "+sokrDNF);

        List absorpSokrDNF = absorption(sokrDNF);
        System.out.println("После применения поглощения: "+absorpSokrDNF);


        System.out.println();
        System.out.println("Таблица Квайна");
        String[][] quineTable = getQuineTable(sdnf,absorpSokrDNF);
        writeArray(quineTable);
        System.out.println();

        List core = getCore(quineTable);
        core = removeEquals(core);
        System.out.println("Ядро функции: "+core);

        String[] deadlocks = getDeadlocks(quineTable);
        writeArray(deadlocks);



    }

    public static List getSDNF(String[] funcValues, String[][] trTable, String[] symb, int colums , String res){
        for(int i=0; i<funcValues.length; i++){
            for(int j=0;funcValues[i].equals("1") && j < colums;j++){
                res += (trTable[i][j].equals("0") ? symb[j+6] : symb[j]);
                if(j == colums-1){
                    res += " v ";
                }
            }
        }
        List<String> sdnf = new ArrayList<String>(Arrays.asList(res.split(" v ")));
        return sdnf;
    }
    public static List getSokrDNF(List exSDNF, String[] symbols){
        ArrayList sdnf = new ArrayList<String>(exSDNF);
        int n = sdnf.size();
        int flag = 0;
        int start = 0;
        while(start != n) {
            for (int i = start; i < n; i++) { // строка в массиве, которую сравнивают
                for (int k = i + 1; k < n; k++) {  // следующие строки в массиве
                    for (int j = 0; j < sdnf.get(i).toString().length(); j++) { // символ в строке , который сравнивают

                        for (int s = 0; s < sdnf.get(k).toString().length(); s++) { // s-й символ в этих строках
                            if (countOfDifferents(sdnf.get(i).toString(),sdnf.get(k).toString()) == 1 && getReversSymbol(sdnf.get(i).toString().substring(j, j + 1), symbols).equals(sdnf.get(k).toString().substring(s, s + 1)) && getTruthString(sdnf.get(i).toString(),symbols).equals(getTruthString(sdnf.get(k).toString(),symbols))) {
                                sdnf.add(sdnf.get(i).toString().substring(0, j) + sdnf.get(i).toString().substring(j + 1));
                            }

                        }
                    }
                }
            }
            start = n;
            n = sdnf.size();
        }
        return sdnf;
    }
    public static String getSKNF(String[] funcValues, String[][] trTable, String[] symb, int colums , String res){
        int k = 1;
        for(int i=0; i<funcValues.length; i++){
            for(int j=0;funcValues[i].equals("0") && j < colums;j++){
                if(k==1){
                    res+="(";
                    k=0;
                }
                res += (trTable[i][j].equals("1") ? symb[j+6] : symb[j]);
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
    public static List absorption(List sokrSDNF){
//        [\\S]*[á][\\S]*[ú][\\S]*
        String pattern = "";
        int size = sokrSDNF.size()-1;
        for(int i = size; i>=0;i--) {
            pattern = getRegExp(sokrSDNF.get(i).toString());
            for(int j = i-1; j>=0; j--){
                if(regAbsorption(sokrSDNF.get(j).toString(), pattern)){
                    sokrSDNF.remove(j);
                    i--;
                }
            }
            size = sokrSDNF.size();
        }
        return sokrSDNF;

    }
    public static String[][] getQuineTable(List sdnf, List absorpSorkDNF){
        String[][] quineTable = new String[absorpSorkDNF.size()+1][sdnf.size()+1];
        quineTable[0][0] = "*_*";

        for(int i = 1; i<quineTable.length;i++){
            quineTable[i][0] = absorpSorkDNF.get(i-1).toString();
        }
        for(int i = 1; i< sdnf.size()+1;i++){
            quineTable[0][i] = sdnf.get(i-1).toString();
        }
        for(int i =1; i<quineTable.length;i++){
            for(int j = 1; j < sdnf.size()+1;j++){
                if(regAbsorption(quineTable[0][j],getRegExp(quineTable[i][0]))){
                    quineTable[i][j] = "1";
                }
                else{
                    quineTable[i][j] = "0";
                }
            }
        }

        return quineTable;
    }
    public static List getCore(String[][] quineTable){
        ArrayList core = new ArrayList();
        for(int i = 1; i<quineTable[0].length; i++){
            for(int j = 1; j < quineTable.length && checkCore(quineTable,i);j++){
                if(quineTable[j][i].equals("1")){
                    core.add(quineTable[j][0]);
                    break;
                }
            }
        }
        return core;
    }
    public static String[] getDeadlocks(String[][] quineTable){
        String res = "";
        for(int i = 1; i<quineTable[0].length; i++){
            res+="(";
            for(int j = 1; j<quineTable.length; j++){
                if(quineTable[j][i].equals("1")) res+=quineTable[j][0]+" v ";
            }
            res+=")";
        }
        String[] deadlocks = res.split(" v \\)");
        for(int i =0; i<deadlocks.length;i++){
            deadlocks[i] = deadlocks[i].replace("(","");
        }
        return deadlocks;
    }



    public static String getReversSymbol(String symb, String[] symbols){
        int i = 0;
        while(i<symbols.length && !(symbols[i].equals(symb))) i++;
        return symbols[(i+symbols.length/2)%symbols.length];
    }
    public static String getTruthString(String str, String[] symb){
        int j = 0;
        String res = "";
        for(int i = 0; i<str.length(); i++){
            j=0;
            while(j<symb.length){
                if(str.substring(i,i+1).equals(symb[j])){
                    res+=symb[j%(symb.length/2)];
                }
                j++;
            }
        }
        return res;
    }
    public static List removeEquals(List dnf){
        for(int i = 0; i< dnf.size(); i++){
            for(int j = i+1; j< dnf.size(); j++){
                if(dnf.get(i).equals(dnf.get(j))){
                    dnf.remove(j);
                }
            }
        }
        return dnf;
    }
    public static int countOfDifferents(String s1, String s2){
        int count = 0;
        for(int i = 0; i<s1.length(); i++){
            if(!s1.substring(i,i+1).equals(s2.substring(i,i+1))) count++;
        }
        return count;
    }
    public static String getRegExp(String exampat){
        String pattern ="";
        for(int i = 0; i< exampat.length();i++){
            pattern += "[\\S]*"+exampat.substring(i,i+1);
        }
        return pattern;
    }
    public static boolean regAbsorption(String verifiable,String pattern){
        Pattern pat = Pattern.compile(pattern+"[\\S]*");
        Matcher mat = pat.matcher(verifiable);
        if(mat.find()){
            return true;
        }
        return false;
    }
    public static boolean checkCore(String[][] mas, int i){
        int count = 0;
        for(int j = 1; j<mas.length;j++){
            if(mas[j][i].equals("1")) {
                count++;
            }
        }
        if(count == 1) return true;
        return false;
    }

    public static void writeArray(String[][] m){
        int size = m[1][1].length();
        if(size > 4) size=7;
        for(int i =0; i <m.length;i++){
            for(int j=0; j<m[i].length; j++){
                System.out.printf("%-7s",m[i][j]);
            }
            System.out.println();
        }
    }
    public static void writeArray(String[] m){
        for(int i = 0; i<m.length;i++){
            System.out.print("("+m[i]+")");
        }
    }
//1010101101001001
//4

//0101010100000011
//4

//10011111
//3

//1111
//2

//01101101010111001110101000001011
//5

//0110110101011100111010100000101110110101100101101100010100001011
//6

}