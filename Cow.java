package Farm;

public class Cow extends Animal implements Moveble, MilkGiveble {


    Cow(double m){
        super(m);
    }

    @Override
    public double giveMeat() {
        return this.m*0.8;
    }

    @Override
    public void eat(double eatMas) {
        this.m += eatMas*0.3+0.2;
    }

    @Override
    public double giveMilk() {
        return this.m/3;
    }

    @Override
    public double move() {
        return this.m/3;
    }
}
