public class BigAlbaInteger {
    String[] value;
    BigAlbaInteger(String n){
        value = n.split("");
    }





    public BigAlbaInteger add(BigAlbaInteger second){
        for(int i = getMinLength(this,second); i>0; i++){
            System.out.println(this.value[i]);
            System.out.println(second.value[i]);
            this.value[i] = String.valueOf(Integer.parseInt(this.value[i])+Integer.parseInt(second.value[i]));
            if(Integer.parseInt(this.value[i])+Integer.parseInt(second.value[i])>9){
                this.value[i] = String.valueOf(Integer.parseInt(this.value[i])-10);
                this.value[i+1] = String.valueOf(Integer.parseInt(this.value[i+1])+1);
            }
        }
        return this;
    }
    public static int getMinLength(BigAlbaInteger a, BigAlbaInteger b){
        if(a.value.length >= b.value.length) return a.value.length;
        return b.value.length;
    }
    public static int countOfDischarge(String str){
        int counterDischarge = 0;
        while(counterDischarge<str.length()){
            counterDischarge++;
        }
        return counterDischarge;
    }
    public static void write(BigAlbaInteger a){
        for(int i =0; i<a.value.length;i++){
            System.out.print(a.value[i]);
        }
    }

}
