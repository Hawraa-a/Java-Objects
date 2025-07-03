public class Phone {
    // States
    int batteryLevel = 100;
    String brand = "Unknown";
    int storageUsed = 0;
    // Just one if statement in takePhoto()
    void takePhoto() {
        if (batteryLevel > 0) {
            System.out.println("New photo taken");
            storageUsed += 2;
            batteryLevel -= 5;
        } else {
            System.out.println("Cannot take photo - battery dead");
        }
    }
    // Other behaviors (simple without conditions)
    void installApp(int size) {
        storageUsed += size;
        System.out.println("Tha app has been installed with a size of " + size + "MB");
    }
    void makeCall() {
        System.out.println("The call is in progress");
        batteryLevel -= 10;
    }
    void printPhoneInfo() {
        System.out.println("\n==== Phone information ====");
        System.out.println("brand: " + brand);
        System.out.println("batteryLevel: " + batteryLevel + "%");
        System.out.println("storageUsed: " + storageUsed + "MB");
        System.out.println("========================\n");
    }
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.brand = "Samsung";
        myPhone.takePhoto(); // Works - battery > 0
        myPhone.takePhoto(); // Works again
        myPhone.makeCall();
        myPhone.installApp(50);
        // Test with empty battery
        myPhone.batteryLevel = 0;
        myPhone.takePhoto(); // Will show battery empty message
        myPhone.printPhoneInfo();
    }
}