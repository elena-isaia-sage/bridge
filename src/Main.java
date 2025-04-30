import bridge.*;
import inheritance.BasicRadioRemote;
import inheritance.BasicTVRemote;
import inheritance.ComplexRadioRemote;
import inheritance.ComplexTVRemote;

public class Main {
    public static void main(String[] args) {
        // without bridge design pattern
        BasicTVRemote basicTV = new BasicTVRemote();
        ComplexTVRemote advancedTV = new ComplexTVRemote();
        BasicRadioRemote basicRadio = new BasicRadioRemote();
        ComplexRadioRemote advancedRadio = new ComplexRadioRemote();

        basicTV.turnOn();
        advancedTV.unmute();
        basicRadio.turnOff();
        advancedRadio.mute();
        System.out.println();
        System.out.println();


        // with bridge design pattern
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl basicRemote = new RemoteControl(tv);
        ComplexRemoteControl advancedRemote = new ComplexRemoteControl(radio);

        System.out.println("Using Basic Remote with TV:");
        basicRemote.togglePower();
        basicRemote.volumeUp();
        System.out.println();

        System.out.println("Using Advanced Remote with Radio:");
        advancedRemote.togglePower();
        advancedRemote.mute();
    }
}