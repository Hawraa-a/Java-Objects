public class Drone {
    boolean isFlying = false;
    int batteryLevel = 100;
    String gpsLocation = "23.5570 N, 58.47180 w";
    boolean isRecording = false;
    public void takeOff() {
        if (!isFlying && batteryLevel > 20) {
            isFlying = true;
            System.out.println("Drone has taken off from " + gpsLocation);
            batteryLevel -= 5;
        } else if (batteryLevel <= 20) {
            System.out.println("Cannot take off - low battery (" + batteryLevel + "%)");
        } else {
            System.out.println("Drone is already flying");
        }
    }
    public void recordVideo() {
        if (isFlying) {
            isRecording = true;
            System.out.println("Recording started at " + gpsLocation);
        } else {
            System.out.println("Cannot record - drone is not flying");
        }
    }
    public void returnToHome() {
        if (isFlying) {
            System.out.println("Returning to home at " + gpsLocation);
            gpsLocation = "23.578 N, 58.40162 w";
            isFlying = false;
            isRecording = false;
            batteryLevel -= 10; // Battery decrease for return
        } else {
            System.out.println("Drone is already at home location");
        }
    }
    public void displayStatus() {
        System.out.println("\nDrone Status:");
        System.out.println("Flying: " + (isFlying ? "Yes" : "No"));
        System.out.println("Recording: " + (isRecording ? "Yes" : "No"));
        System.out.println("Battery: " + batteryLevel + "%");
        System.out.println("Location: " + gpsLocation);
    }
    public static void main(String[] args) {
        Drone myDrone = new Drone();
        myDrone.displayStatus();
        myDrone.takeOff();
        myDrone.recordVideo();
        myDrone.takeOff();
        myDrone.displayStatus();
        myDrone.returnToHome();
        myDrone.displayStatus();
    }
}