package be.vdab.model.fish;

import be.vdab.model.Fish;

public class Salmon extends Fish {
    String name;
    int age;
    boolean canBreathe;

    @Override
    public String toString() {
        return name + age;
    }
}
