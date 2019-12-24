public class ShopDepartament {
    protected String title;
    private Seller[] sellers = new Seller[0];

    ShopDepartament(String title){
        this.title = title;
    }

    public void setSeller(Seller sel){
        Seller[] newSl = new Seller[this.sellers.length+1];
        for(int i = 0; i<this.sellers.length;i++){
            newSl[i] = this.sellers[i];
        }
        newSl[newSl.length-1] = sel;
        this.sellers = newSl;
    }

    public Seller[] getSellers(){
        return this.sellers;
    }
    public String getTitle(){
        return this.title;
    }
}
