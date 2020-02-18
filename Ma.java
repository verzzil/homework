public class Ma {
    public static void main(String[] args) throws WrongSymbolException, ToLongArg, ToLongNumber, DivisionByZero {
        try {
            Calculator calc = new Calculator("57/0");
            if(calc.getOperation().equals("+")) System.out.println(calc.addition());
            if(calc.getOperation().equals("-")) System.out.println(calc.subtraction());
            if(calc.getOperation().equals("*")) System.out.println(calc.mult());
            if(calc.getOperation().equals("/")) System.out.println(calc.div());
        }catch (WrongSymbolException e){
            System.out.println("Неправильный символ");
        }catch (ToLongArg e){
            System.out.println("Неравильный формат строки");
        }catch (ToLongNumber e) {
            System.out.println("Слишком длинное число");
        }catch (DivisionByZero e){
            System.out.println("Деление на 0");
        }
    }
    public static void writeMas(String[] m){
        for(String val : m){
            System.out.print("["+val+"]");
        }
    }
}
