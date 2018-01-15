public class TelevisorTest {

    // main method
    public static void main(String[] args) {

        // create Televisor object
        Televisor tv = new Televisor("Off");

        // display status
        tv.showStatus();

        // turn on Televisor and display status
        tv.turnOn();
        tv.showStatus();

        // turn off Televisor and display status
        tv.turnOff();
        tv.showStatus();
    }
}
