public class WashingMachine {
    int waterLevel = 0;
    int remainingTime = 0;
    String loadSize = "Small";
    boolean isOn = false;
    public void turnOn() {
        isOn = true;
        System.out.println("Washing machine is now ON.");
    }
    public void startWash(int waterAmount, int washTime) {
        if (isOn) {
            if (waterAmount > 0) {
                waterLevel = waterAmount;
                remainingTime = washTime;
                System.out.println("Washing started with " + waterLevel + " liters of water for " + remainingTime + " minutes.");
            } else {
                System.out.println("Please add water before starting the wash.");
            }
        } else {
            System.out.println("Please turn on the washing machine first.");
        }
    }
    public void drainWater() {
        if (waterLevel > 0) {
            System.out.println("Draining " + waterLevel + " liters of water.");
        } else {
            System.out.println("No water to drain.");
        }
    }
    public void showStatus() {
        System.out.println("\nWashing Machine Status:");
        System.out.println("Load Size: " + loadSize);
        System.out.println("Water Level: " + waterLevel + " liters");
        System.out.println("Remaining Time: " + remainingTime + " minutes");
        System.out.println("Power: " + (isOn ? "ON" : "OFF"));
    }
    public static void main(String[] args) {
        WashingMachine myWashingMachine = new WashingMachine();
        myWashingMachine.showStatus();
        myWashingMachine.turnOn();
        myWashingMachine.startWash(10, 30); // Start wash with 20 liters of water for 30 minutes
        myWashingMachine.drainWater();
        myWashingMachine.showStatus();
    }
}