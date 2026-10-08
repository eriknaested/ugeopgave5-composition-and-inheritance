public class Rabbit extends Animal{

    Rabbit(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return 20;
    }
}
