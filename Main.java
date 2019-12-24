package Farm;

import org.w3c.dom.html.HTMLObjectElement;

public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm();

        Cow cow = new Cow(20);
        Horse osel = new Horse(50);
        Goat goat = new Goat(80);

        farm.addNewAnimal(cow,osel,goat);


    }





}
