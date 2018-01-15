public class Televisor {
    String status;

    // constructor
    Televisor(String status) {
        this.status = status;
    }

    // this method is turning on Televisor
    void turnOn() {
        status = "On";
    }

    // this method is turning off Televisor
    void turnOff() {
        status = "Off";
    }

    // this method is displaying recent status of Televisor
    void showStatus() {
        System.out.println("Televisor is: " + status);
    }
}
