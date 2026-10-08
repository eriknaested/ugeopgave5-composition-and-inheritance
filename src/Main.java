import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* Building building = new Building("Office building");

        Room room1 = new Room("Conference room");
        Room room2 = new Room("CEO office");
        Room room3 = new Room("Bathrooms");

        room1.addLamp(new Lamp(40));
        room1.addLamp(new Lamp (60));
        room1.addWindow(new Window(40, 60));
        room1.addWindow(new Window(40, 60));
        room1.addWindow(new Window(40, 60));

        room2.addLamp(new Lamp(20));
        room2.addLamp(new Lamp(45));
        room2.addLamp(new Lamp(30));
        room2.addWindow(new Window(80, 80));
        room2.addWindow(new Window(80, 80));

        room3.addLamp(new Lamp(20));
        room3.addLamp(new Lamp(20));
        room3.addWindow(new Window(20, 20));

        building.addRoom(room1);
        building.addRoom(room2);
        building.addRoom(room3);

        building.printBuilding();

         */ //Opgave 1

        ArrayList<Animal> animals = new ArrayList<>();

        /* Animal animal1 = new Lion("Simba", 100);
        Animal animal2 = new Wolf("Bertil", 100);
        Animal animal3 = new Rabbit("Bobbi", 200);
        Animal animal4 = new Lion("Shawn", 100);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
         */ //Alternativ måde at lave objekterne på

        animals.add(new Lion("Simba"));
        animals.add(new Wolf("Bertil"));
        animals.add(new Rabbit("Bobbi"));
        animals.add(new Lion("Shawn"));


        for (int i = 0; i + 1 < animals.size(); i += 2) {
            Animal animal1 = animals.get(i);
            Animal animal2 = animals.get(i + 1);

            Contest contest = new Contest(animal1, animal2);

            while (contest.getWinner() == null) {
                contest.playRound();
            }

            System.out.println();
            if (contest.getWinner() == null || animal1.getEnergy() == animal2.getEnergy()) {
                System.out.println("No winner was found. It's a tie!");
            } else {
                System.out.println("Winner is: ");
                System.out.println(contest.getWinner().getName());
                System.out.println();
            }
        }

        // Contest contest1 = new Contest(animal1, animal2);

        /* while (contest1.getWinner() == null) {
            contest1.playRound();
        }

        if (contest1.getWinner() == null) {
            System.out.println("No winner was found. It's a tie!");
        } else {
            System.out.println("Winner is: ");
            System.out.println(contest1.getWinner().getName());
        }

         */
    }
}
