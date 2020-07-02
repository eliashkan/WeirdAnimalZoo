package be.vdab.model.mamals;

import be.vdab.model.Breathable;
import be.vdab.model.Mamal;
import be.vdab.model.fish.ParasiteFish;

public class Whale extends Mamal implements Breathable {

    ParasiteFish[] parasites = new ParasiteFish[0];

    public void eat() {
        System.out.println("nomming on some plankton");
    }

    public void move() {
        System.out.println("moves reallllly whaley");
    }

    public void breathe() {
        System.out.println("breathes out through a hole");
    }
}
