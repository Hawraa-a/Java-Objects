public class Computer{
	String storageSize;
	String processor;
	String brand;
	boolean isOn;
	boolean hasProgramRunning;
	boolean hasSoftwareInstalled;
	
	public void turnOn(){
		if (!isOn){
			isOn = true;
			System.out.println("Computer powered ON: " + brand + processor + storageSize );
		}
		else{
			System.out.println("Computer is already ON");
		}
	}
	
	public void runProgram(){
		if (!isOn){
			System.out.println("The program can not be run");
		}
		if (!hasProgramRunning){
			System.out.println("The program is running");
		}
		else{
			System.out.println("There is a program that already work");
		}
	}
	
	public void installSoftware(){
		if (hasSoftwareInstalled){
			System.out.println("The program has been installed successfully");
		}
		else{
			System.out.println("There is already a program installed");
		}
		
	}
	
	public void turnOff(){
		if (isOn = false && hasProgramRunning = false){
			System.out.println("The computer has been turnOff");
		}
		else{
			System.out.println("The computer is already turnOff");
		}
	}
}