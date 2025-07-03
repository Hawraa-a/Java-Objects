public class AirConditioner {
    // States
    boolean isOn;
    String mode;
    int fanSpeed;
    int currentTemperature;
    public AirConditioner() {
        this.isOn = false;
        this.mode = "COOL";
        this.fanSpeed = 2;
        this.currentTemperature = 24;
    }
    public void turnOn() {
        if (isOn) {
            System.out.println("AC is already on");
        } else {
            System.out.println("AC is off, turning it on now");
            isOn = true;
            System.out.println("Current settings:");
            printStatus();
        }
    }
    public void changeMode(String newMode) {
        mode = newMode;
        System.out.println("Mode changed to: " + newMode);
    }
    public void setTemperature(int newTemp) {
        currentTemperature = newTemp;
        System.out.println("Temperature set to: " + newTemp + "°C");
    }
    public void printStatus() {
        System.out.println("Current status - Power: " + (isOn ? "ON" : "OFF") +
                ", Mode: " + mode +
                ", Fan: " + fanSpeed +
                ", Temp: " + currentTemperature + "°C");
    }
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.changeMode("HEAT");
        ac.setTemperature(22);
        ac.fanSpeed = 3; // Still accessible directly
        ac.printStatus();
    }
}