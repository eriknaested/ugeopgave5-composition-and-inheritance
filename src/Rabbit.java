public class Rabbit extends Animal{

    Rabbit(String name) {
        super(name, 200);
    }

    @Override
    public int attack() {
        return 20;
    }
}
