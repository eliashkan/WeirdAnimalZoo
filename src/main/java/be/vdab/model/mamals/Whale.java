package be.vdab.model.mamals;

import be.vdab.model.Breathable;
import be.vdab.model.Mamal;

public class Whale extends Mamal implements Breathable {

    public void eat() {
        System.out.println("nomming on some plankton");
    }

    public void move() {
        System.out.println("moves reallllly whaley");
    }
}
