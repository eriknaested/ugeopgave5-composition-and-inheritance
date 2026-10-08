public abstract class Animal {

    private String name;
    private int energy;

    Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isActive() {
        return energy > 0;
    }

    public abstract int attack();

    @Override
    public String toString() {
        return super.toString();
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
