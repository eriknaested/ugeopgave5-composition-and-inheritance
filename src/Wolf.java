import java.util.Random;

public class Wolf extends Animal{

    Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        Random random = new Random();
        return random.nextInt(60 - 20 + 1) + 20;
    }
}
