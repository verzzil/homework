package Farm;

public class Farm {

    Moveble[] moveAnimals;
    MilkGiveble[] giveMilkAnimals;
    Eatable[] giveEatAnimals;
    WodGiveble[] giveWodAnimals;
    MeatGiveble[] giveMeatAnimals;


    Farm(){
        this.moveAnimals = new Moveble[0];
        this.giveMilkAnimals = new MilkGiveble[0];
        this.giveEatAnimals = new Eatable[0];
        this.giveWodAnimals = new WodGiveble[0];
        this.giveMeatAnimals = new MeatGiveble[0];
    }

    public void addNewAnimal(Animal... animal){
        for(int i = 0; i<animal.length; i++){
            if(animal[i] instanceof Moveble) addMoveble((Moveble)animal[i]);
            if(animal[i] instanceof MilkGiveble) addMilkable((MilkGiveble)animal[i]);
            if(animal[i] instanceof Eatable) addEatable((Eatable)animal[i]);
            if(animal[i] instanceof WodGiveble) addWod((WodGiveble)animal[i]);
            if(animal[i] instanceof MeatGiveble) addMeatable((MeatGiveble)animal[i]);
            System.out.println(animal[i]);
        }
    }
    private void addMoveble(Moveble animal){
        Moveble[] newMas = new Moveble[this.moveAnimals.length+1];
        for(int i = 0; i<this.moveAnimals.length; i++){
            newMas[i] = this.moveAnimals[i];
        }
        newMas[this.moveAnimals.length] = animal;
        this.moveAnimals = newMas;
    }
    private void addMilkable(MilkGiveble animal){
        MilkGiveble[] newMas = new MilkGiveble[this.giveMilkAnimals.length+1];
        for(int i = 0; i<this.giveMilkAnimals.length; i++){
            newMas[i] = this.giveMilkAnimals[i];
        }
        newMas[this.giveMilkAnimals.length] = animal;
        this.giveMilkAnimals = newMas;
    }
    private void addEatable(Eatable animal){
        Eatable[] newMas = new Eatable[this.giveEatAnimals.length+1];
        for(int i = 0; i<this.giveEatAnimals.length; i++){
            newMas[i] = this.giveEatAnimals[i];
        }
        newMas[this.giveEatAnimals.length] = animal;
        this.giveEatAnimals = newMas;
    }
    private void addWod(WodGiveble animal){
        WodGiveble[] newMas = new WodGiveble[this.giveWodAnimals.length+1];
        for(int i = 0; i<this.giveWodAnimals.length; i++){
            newMas[i] = this.giveWodAnimals[i];
        }
        newMas[this.giveWodAnimals.length] = animal;
        this.giveWodAnimals = newMas;
    }
    private void addMeatable(MeatGiveble animal){
        MeatGiveble[] newMas = new MeatGiveble[this.giveMeatAnimals.length+1];
        for(int i = 0; i<this.giveMeatAnimals.length; i++){
            newMas[i] = this.giveMeatAnimals[i];
        }
        newMas[this.giveMeatAnimals.length] = animal;
        this.giveMeatAnimals = newMas;
    }

    public void feedAll(double mass){
        for(int i = 0; i<giveEatAnimals.length; i++){
            giveEatAnimals[i].eat(mass);
        }
    }
    public double toMilk(){
        double result = 0;
        for(int i = 0; i<giveMilkAnimals.length; i++){
            result+=giveMilkAnimals[i].giveMilk();
        }
        return result;
    }
    public double getWod(){
        double result = 0;
        for(int i = 0; i<giveWodAnimals.length; i++){
            result+=giveWodAnimals[i].giveWod();
        }
        return result;
    }
    public String slaughter(double requiredWeight){
        double sum = 0;
        int i = 0;
        while(i<this.giveMeatAnimals.length && sum<requiredWeight){
            sum+=this.giveMeatAnimals[i].giveMeat();
            if(i == this.moveAnimals.length-1) return sum+" вы не сможете получить столько мяса";

            i++;
        }
        return sum+" отлично, вам достаточно мяса";
    }
    public String isMove(double m){
        double sum = 0;
        int i = 0;
        while(i<this.moveAnimals.length && sum < m){
            sum+=this.moveAnimals[i].move();
            if(i == this.moveAnimals.length-1) return "В вашей ферме недостаточно животных, чтобы перевести этот груз";

            i++;
        }
        return "Вам понадобится "+i+" животных из вашего загона, чтобы перевести груз в "+m+" килограм";
    }


}
