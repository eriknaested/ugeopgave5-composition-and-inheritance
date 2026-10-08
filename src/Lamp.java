public class Lamp {

    private int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
        } else {
            System.out.println("Lamp is already on");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
        } else {
            System.out.println("Lamp is already off");
        }
    }

    @Override
    public String toString() {
        return "Lamp watt: " + watt + ". Is on: " + isOn;
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
