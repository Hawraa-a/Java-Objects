public class Camera {
    String lensType = "Wide";
    int batteryLevel = 98;
    String mode = "photo";
    int photosTaken = 1;
    public void takePhoto() {
        if (batteryLevel > 0) {
            System.out.println("Click! Photo taken with " + lensType + " lens in " + mode + " mode");
            photosTaken++;
            batteryLevel -= 2;
        } else {
            System.out.println("Can't take photo - battery empty!");
        }
    }
    public void changeMode(String newMode) {
        mode = newMode;
        System.out.println("Switched to " + mode + " mode");
    }
    public void deleteMedia() {
        if (photosTaken > 0) {
            photosTaken--;
            System.out.println("Deleted one photo");
        } else {
            System.out.println("No photos to delete");
        }
    }
    public void showStatus() {
        System.out.println("Camera Status:");
        System.out.println("Lens: " + lensType);
        System.out.println("Battery: " + batteryLevel + "%");
        System.out.println("Mode: " + mode);
        System.out.println("Photos: " + photosTaken);
    }
    public static void main(String[] args) {
        Camera myCamera = new Camera();
        myCamera.showStatus();
        myCamera.takePhoto();
        myCamera.changeMode("Portrait");
        myCamera.takePhoto();
        myCamera.deleteMedia();
        myCamera.showStatus();
    }
}