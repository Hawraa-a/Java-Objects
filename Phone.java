public class Phone {
 
    int batteryLevel = 100;
    String brand = "Samsung";
    int storageUsed = 0;

    void takePhoto() {
        if (batteryLevel > 0) {
            System.out.println("New photo taken");
            storageUsed += 2;
            batteryLevel -= 5;
        } else {
            System.out.println("Cannot take photo - battery dead");
        }
    }

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

    }
    
}