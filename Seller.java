public class Seller {
    private String name;
    private int revenue;
    Seller(String name, int rev){
        this.name = name;
        this.revenue = rev;
    }

    public String getName(){
        return this.name;
    }
    public int getRev(){
        return this.revenue;
    }
}
