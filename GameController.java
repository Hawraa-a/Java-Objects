public class GameController {
    String mode = "Multiplayer";
    boolean isConnected = false;
    int batteryLevel = 100;
    boolean isOn = false;
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Controller powered on");
            batteryLevel -= 5; // Battery drain when turning on
        } else {
            System.out.println("Controller is already on");
        }
    }
    public void turnOff() {
        if (isOn) {
            isOn = false;
            isConnected = false;
            System.out.println("Controller powered off");
        } else {
            System.out.println("Controller is already off");
        }
    }
    public void connect() {
        if (isOn) {
            isConnected = true;
            System.out.println("Controller connected");
        } else {
            System.out.println("Cannot connect - turn on controller first");
        }
    }
    public void pressButton(String button) {
        if (isOn && isConnected) {
            System.out.println("Button pressed: " + button + " (" + mode + " mode)");
            batteryLevel -= 1; // Small battery drain per button press
        } else if (!isOn) {
            System.out.println("Cannot press buttons - controller is off");
        } else {
            System.out.println("Cannot press buttons - controller disconnected");
        }
    }
    public void displayStatus() {
        System.out.println("\n== Controller Status ==");
        System.out.println("Power: " + (isOn ? "ON" : "OFF"));
        System.out.println("Mode: " + mode);
        System.out.println("Connected: " + isConnected);
        System.out.println("Battery: " + batteryLevel + "%");
    }
    public static void main(String[] args) {
        GameController controller = new GameController();
        controller.displayStatus();
        controller.turnOn();
        controller.connect();
        controller.pressButton("A");
        controller.pressButton("Trigger");
        controller.displayStatus();
        controller.turnOff();
        controller.displayStatus();
    }
}