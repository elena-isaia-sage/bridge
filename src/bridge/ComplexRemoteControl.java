package bridge;

public class ComplexRemoteControl extends RemoteControl {
    public ComplexRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Muting the device");
        device.setVolume(0);
    }
}
