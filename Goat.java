package Farm;

public class Goat extends Animal implements WodGiveble, MilkGiveble {

    Goat(double m){
        super(m);
    }


    @Override
    public double giveMeat() {
        return this.m*0.7;
    }

    @Override
    public double giveMilk() {
        return this.m/4;
    }

    @Override
    public double giveWod() {
        return this.m*0.01;
    }

    @Override
    public void eat(double eatMas) {
        this.m += eatMas*0.5;
    }
}
