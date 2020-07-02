package be.vdab.model;

public abstract class Fish extends Animal {

    private boolean hasTeeth;

    public abstract void talk();

    public boolean isHasTeeth() {
        return hasTeeth;
    }

    public void setHasTeeth(boolean hasTeeth) {
        this.hasTeeth = hasTeeth;
    }
}
