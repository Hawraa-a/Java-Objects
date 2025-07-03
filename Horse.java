public class Horse {
   String name = "Thunder";
   String color = "Brown";
   int age = 2;
    public void eating() {
        System.out.println(name + " is eating.");
    }
    public void running() {
        if (age < 5) {
            System.out.println(name + " (young horse) is galloping energetically!");
        } else if (age <= 15) {
            System.out.println(name + " is running at a steady pace.");
        } else {
            System.out.println(name + " (senior horse) is moving slowly but steadily.");
        }
    }
    public void sleeping() {
        System.out.println(name + " is lying down and sleeping.");
    }
   public void showinfo(){
       System.out.println("==Horse Information==");
       System.out.println("Horse name: " + name);
       System.out.println("Age: " + age + " years");
       System.out.println("Color: " + color);
   }
   public static void main(String[] args) {
       Horse horse1 = new Horse();
       horse1.showinfo();
       horse1.eating();
       horse1.running();
       horse1.sleeping();
   }
}