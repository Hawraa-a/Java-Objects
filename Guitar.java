public class Guitar {
    String type = "Electric";
    int volumeLevel = 6;
    String brand = "Fender";
    public void playChord(String chord) {
        System.out.println("Playing " + chord + " chord on " + brand + " " + type + " guitar");
    }
    public void strumming(int speed) {
        System.out.println("Strumming " + type + " guitar at speed " + speed
                + " (Volume " + volumeLevel + ")");
    }
    public void muting() {
        System.out.println(brand + " guitar muted");
        volumeLevel = 0;
    }
    public void displayInfo() {
        System.out.println("\n== Guitar Info ==");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Volume: " + volumeLevel + "/10");
    }
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();
        myGuitar.displayInfo();
        myGuitar.playChord("G");
        myGuitar.strumming(3);
        myGuitar.muting();
        myGuitar.displayInfo();
    }
}