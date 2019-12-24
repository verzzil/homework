package Farm;

public abstract class Animal implements MeatGiveble, Eatable {
    double m;

    Animal(double m){
        this.m = m;
    }
}
