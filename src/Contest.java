public class Contest {

    private Animal animal1;
    private Animal animal2;
    private int round;

    public Contest(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.round = 1;
    }

    public void playRound() {
        System.out.println(" --- Round " + round + " --- ");

        int attack1 = animal1.attack();
        int attack2 = animal2.attack();
        animal1.setEnergy(animal1.getEnergy() - attack2);
        System.out.println(animal2.getName() + " attacks " + animal1.getName() + " for " + attack2 + ". " + animal1.getName() + " has " + animal1.getEnergy() + " energy left");

        animal2.setEnergy(animal2.getEnergy() - attack1);
        System.out.println(animal1.getName() + " attacks " + animal2.getName() + " for " + attack1 + ". " + animal2.getName() + " has " + animal2.getEnergy() + " energy left");
        round++;
    }

    public Animal getWinner() {
        if (animal1.isActive() && animal2.isActive()) {
            return null;
        } else if (animal1.getEnergy() > animal2.getEnergy()) {
            return animal1;
        } else {
            return animal2;
        }
    }

}
