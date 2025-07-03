public class Microwave {
    String currentMode;
    int powerLevel = 8;
    String brand;
    int timeRemaining;
    public void setTimer(int seconds){
        this.timeRemaining = seconds;
        System.out.println("Timer set: " + seconds + "seconds");
    }
    public void setPowerLevel(int level){
        if (level <=10){
            this.powerLevel = level;
            System.out.println("Power level set to: " + level);
        }
        else{
            System.out.println("Invalid power level - (1 to 10 only)");
        }
    }
    public void changeMode(String mode){
        this.currentMode = mode;
        System.out.println("Mode changed to: " + mode);
    }
    public void displayStatus() {
        System.out.println("\n=== " + brand + " Microwave ===");
        System.out.println("Mode: " + currentMode);
        System.out.println("Power: " + powerLevel + "/10");
        System.out.println("Time remaining: " + timeRemaining + "s");
    }
    public static void main(String[] args) {
        Microwave microwave = new Microwave();
        microwave.brand = "Panasonic";
        microwave.displayStatus();
        microwave.changeMode("Defrost");
        microwave.setPowerLevel(8);
        microwave.setTimer(45);
        microwave.displayStatus();
    }
}