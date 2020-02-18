public class Calculator {
    private long a;
    private long b;
    private String operation;

    Calculator(String str) throws ToLongArg, WrongSymbolException, ToLongNumber {
        Parser p = new Parser(str);
        a = Long.parseLong(p.num[0]);
        b = Long.parseLong(p.num[2]);
        operation = p.num[1];
    }

    public long addition(){
        return a+b;
    }
    public long subtraction(){
        return a-b;
    }
    public long mult(){
        return a*b;
    }
    public long div() throws DivisionByZero {
        if (b==0) throw new DivisionByZero();
        return a/b;
    }

    public long getA() {
        return a;
    }

    public long getB() {
        return b;
    }

    public String getOperation() {
        return operation;
    }
}
