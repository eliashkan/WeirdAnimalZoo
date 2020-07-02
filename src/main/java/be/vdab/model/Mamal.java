package be.vdab.model;

public abstract class Mamal extends Animal implements Breathable {

    private int legCount;
    private boolean canSwim;

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
}
