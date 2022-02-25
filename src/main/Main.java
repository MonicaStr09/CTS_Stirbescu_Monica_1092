package main;

import Zoo.Zoo;
import Zoo.Ingrijitor;
import Zoo.Zebra;
import Zoo.Girafa;

public class Main {
    public static void main(String[] args) {
        Ingrijitor ingrijitor =new Ingrijitor("Moni Stroe");
        Zoo zoo=new Zoo("Gradina zoo din Slatina", ingrijitor);

        zoo.addAnimal(new Girafa("Marty"));
        zoo.addAnimal(new Girafa("Luca"));
        zoo.addAnimal(new Zebra("Bob"));

        zoo.hranesteAnimale();
    }
}
