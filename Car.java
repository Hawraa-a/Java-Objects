public class Car {
    int currentSpeed = 120;
    int gearPosition = 0;
    int mileage = 25;
    boolean isEngineOn = false;
    void shiftGear(int newGear) {
        gearPosition = newGear;
        System.out.println("Current gear: " + gearPosition);
    }
    void lockDoor() {
        System.out.println("The doors are locked");
    }
    void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println("The engine is running");
        } else {
            System.out.println("The engine is already running");
        }
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.startEngine();
        car.shiftGear(1);
        car.shiftGear(3);
        car.lockDoor();
        System.out.println("Speed: " + car.currentSpeed);
        System.out.println("Gear: " + car.gearPosition);
        System.out.println("Mileage: " + car.mileage);
    }
}