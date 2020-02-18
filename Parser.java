public class Parser {
    public String[] num;

    Parser(String str) throws WrongSymbolException, ToLongArg, ToLongNumber {
        num = new String[3];
        num = convert(str);
    }

    private String[] convert(String str) throws WrongSymbolException, ToLongArg, ToLongNumber {
        String[] res = new String[3];
        char[] operations = {'+','-','*','/'};
        int k = 0;
        for(int i = 0; i < res.length; i++) res[i] = "";
        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) < '0' || str.charAt(i) > '9') && !isInArr(operations,str.charAt(i))){
                throw new WrongSymbolException();
            }
            else if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                res[k] += str.charAt(i);
            }
            else {
                k++;
                if(k>2) throw new ToLongArg();
                res[k] += str.charAt(i);
                k++;
            }
        }
        if(res[0].length() > 18 || res[2].length() > 18) throw new ToLongNumber();
        return res;
    }
    private boolean isInArr(char[] symbols, char symb) {
        for(int i = 0; i < symbols.length; i++){
            if (symbols[i] == symb) return true;
        }
        return false;
    }

}
