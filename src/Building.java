import java.util.ArrayList;

public class Building {

    private String name;
    private ArrayList<Room> rooms;

    Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {
        int sum = 0;
        for (Room r : rooms) {
            sum += r.getLampCount();
        }
        return sum;
    }

    public int getTotalWatt() {
        int sum = 0;
        for (Room r : rooms) {
            sum += r.getTotalWatt();
        }
        return sum;
    }

    public void printBuilding() {
        System.out.println("BUILDING " + name);
        System.out.println("Total rooms: " + rooms.size());
        System.out.println("Total lamps: " + getTotalLampCount());
        System.out.println("Total watt: " + getTotalWatt());
        System.out.println();
        for (Room r : rooms) {
            r.printRoom();
        }
    }
}
