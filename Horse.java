package Farm;

public class Horse extends Animal implements Moveble  {

    Horse(double m){
        super(m);
    }


    @Override
    public double giveMeat() {
        return 0.6*this.m;
    }

    @Override
    public double move() {
        return this.m/3;
    }

    @Override
    public void eat(double eatMas) {
        this.m += eatMas*0.4;
    }
}
