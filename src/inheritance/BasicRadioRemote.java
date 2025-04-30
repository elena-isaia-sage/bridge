package inheritance;

public class BasicRadioRemote extends Remote {
    @Override
    public void turnOn() {
        System.out.println("Turning on the Radio.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the Radio.");
    }
}
