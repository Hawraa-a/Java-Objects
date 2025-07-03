public class Tv {
    Boolean isMuted = false;
    int screenSize = 55;
    int volumeLevel = 21;
    String channel;
    String currentInput;
    public void turnOn() {
        if (isMuted) {
            System.out.println("The Tv is muted");
        } else {
            System.out.println("The Tv is not muted");
        }
    }
    private void increaseVolume(int newVolume) {
        volumeLevel =newVolume;
        System.out.println("Volume changed to: " + newVolume);
    }
    public void changeChannel(String newChannel) {
        channel = newChannel;
        System.out.println("channel changed to: " + newChannel);
    }
    public void switchInput(String newInput) {
        currentInput = newInput;
        System.out.println("switchInput to: " + newInput);
    }
    public void printStatus() {
        System.out.println("Current status - Muted: " + (isMuted ? "ON" : "OFF") +
                ", volumeLevel: " + volumeLevel +
                ", ScreenSize: " + screenSize +
                ", Channel: " + channel +
                ", Input: " + currentInput);
    }
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.turnOn();
        tv.increaseVolume(26);
        tv.switchInput("wi-fi");
        tv.changeChannel("Oman");
        tv.printStatus();
    }
}