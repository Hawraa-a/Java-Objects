public class Turtle{
	int age;
	boolean isAquatic;
	String species = "Land Turtle";
	boolean isHungry = true;
	boolean inShell = false;
	
	public void eating(){
		if (inShell){
			System.out.println(species + " can not eat while hiding in it's shell");
			return;
		}
		System.out.println(species + " is eating");
	}
	
	public void swimming(){
		if (!isAquatic){
		System.out.println(species + " can not swim");	
		return;
		}
		System.out.println(species + " is swimming");
	}
	
	public void hideInShell(){
		if (inShell){
		System.out.println(species + " is already hiding in its shell");
		return;
		}
		inShell = true;
		System.out.println(species + " is hides inside its shell");
	}
}