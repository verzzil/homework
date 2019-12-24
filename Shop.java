public class Shop {
    private String title;
    private ShopDepartament[] shopDep = new ShopDepartament[0];
    Shop(String tit){
        this.title = tit;
    }

    public void setDep(ShopDepartament shD){
        ShopDepartament[] newDep = new ShopDepartament[this.shopDep.length+1];
        for(int i = 0; i<this.shopDep.length;i++){
            newDep[i] = this.shopDep[i];
        }
        newDep[newDep.length-1] = shD;
        this.shopDep = newDep;
    }

    public ShopDepartament[] getDep(){
        return this.shopDep;
    }
    public String getTitle(){
        return this.title;
    }

    public void writeShopDeps(){
        for(int i = 0; i<this.shopDep.length; i++){
            System.out.print(this.shopDep[i].getTitle()+" || ");
        }
    }
}
