public class CoffeeMachine {
    // States
    int waterLevel = 0;    // in (ml)
    int beanLevel = 20;     // in (g)
    int temperature = 28;   // in °C
    boolean isOn = false;
    // Behaviors
    public void refillWater(int amount) {
        waterLevel += amount;
        System.out.println("Added " + amount + "ml of water. Current water level: " + waterLevel + "ml");
    }
    public void displayStatus() {
        System.out.println("=== Coffee Machine Status ===");
        System.out.println("Power: " + (isOn ? "ON" : "OFF"));
        System.out.println("Water level: " + waterLevel + "ml");
        System.out.println("Beans level: " + beanLevel + "g");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("=======================");
    }
    public void turnOn() {
        if (isOn) {
            System.out.println("Coffee machine is already ON");
        } else {
            isOn = true;
            System.out.println("Coffee machine turned ON");
        }
    }
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.displayStatus();
        machine.turnOn();
        machine.refillWater(500);
        machine.displayStatus();
    }
}