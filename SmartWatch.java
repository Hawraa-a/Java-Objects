public class SmartWatch {
    // States
    int heartRate = 0;
    String brand;
    int batteryLevel = 100;
    int stepCount = 0;
    boolean isOn = true;
    // Constructor
    public SmartWatch(String brand) {
        this.brand = brand;
    }
    // Behaviors
    public void showNotification(String message) {
        if (isOn) {
            System.out.println("[" + brand + "] Notification: " + message);
        }
    }
    public void checkBattery() {
        System.out.println("Battery Level: " + batteryLevel + "%");
        if (batteryLevel < 20) {
            System.out.println("Low battery warning!");
        }
    }
    public void trackSteps(int steps) {
        if (isOn) {
            stepCount += steps;
            System.out.println("Tracked " + steps + " steps. Total: " + stepCount);
        }
    }
    public void powerOff() {
        isOn = false;
        System.out.println(brand + " watch powered off");
    }
    public void displayStats() {
        System.out.println("\n=== " + brand + " Watch Stats ===");
        System.out.println("Heart Rate: " + heartRate + " BPM");
        System.out.println("Battery: " + batteryLevel + "%");
        System.out.println("Steps: " + stepCount);
    }
    public static void main(String[] args) {
        SmartWatch watch = new SmartWatch("Apple");
        watch.showNotification("Good morning!");
        watch.trackSteps(1500);
        watch.heartRate = 72;
        watch.batteryLevel = 15;
        System.out.println("\nCurrent Status:");
        System.out.println("Brand: " + watch.brand);
        System.out.println("Steps: " + watch.stepCount);
        System.out.println("Heart Rate: " + watch.heartRate + " BPM");
        watch.checkBattery();
    }
}