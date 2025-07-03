public class Printer{
    int inkLevel = 100;
    int paperCount = 0;
    String connectionType;
    boolean isOn = false;
    public void addPaper(int papers){
        if (papers > 0){
            paperCount =+ papers;
            System.out.println("Added " + papers + " Papers. Total paper: " + paperCount);
        }
        else{
            System.out.println("Invalid number of sheets");
        }
    }
    public void refillInk(){
        inkLevel = 100;
        System.out.println("Ink refilled to 100%");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Printer powered off");
    }
    public void displayStatus() {
        System.out.println("\nPrinter Status:");
        System.out.println("Connection: " + connectionType);
        System.out.println("Paper: " + paperCount + " sheets");
        System.out.println("Ink: " + inkLevel + "%");
    }
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.connectionType = "Wifi";
        printer.addPaper(50);
        printer.refillInk();
        printer.displayStatus();
        printer.turnOff();
    }
}