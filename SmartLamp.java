public class SmartLamp {
    String brand = "Philips";
    boolean isOn = false;
    String color = "White";
    String mode = "Normal";
    public void turnOn() {
        isOn = true;
        System.out.println(brand + " lamp turned on");
    }
    public void changeColor(String newColor) {
        if (isOn) {
            color = newColor;
            System.out.println("Color changed to " + color);
        } else {
            System.out.println("Cannot change color - lamp is off");
        }
    }
    public void connectToApp() {
        isOn = true;
        System.out.println("Connected to SmartHome App");
    }
    public void setMode(String newMode) {
        mode = newMode;
        System.out.println("Mode set to: " + newMode);
    }
    public void showStatus() {
        System.out.println("\n" + brand + " Smart Lamp");
        System.out.println("Power: " + (isOn ? "ON" : "OFF"));
        System.out.println("Color: " + color);
        System.out.println("Mode: " + mode);
    }
    public static void main(String[] args) {
        SmartLamp lamp = new SmartLamp();
        lamp.connectToApp();
        lamp.changeColor("Blue");
        lamp.setMode("Relax");
        lamp.showStatus();
    }
}