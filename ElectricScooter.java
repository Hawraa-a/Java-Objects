public class ElectricScooter{
	int speed = 0;
	boolean isLocked = true;
	String brand = "";
	int batteryLevel = 100;
	boolean isCharging = false;
	
	public void chargeBattery(){
		if (isLocked){
			System.out.println("Can not charge while locked");
			return;
		}
		if (batteryLevel = 100){
			System.out.println("Battery already fully charge");
		}
		isCharging = true;
		System.out.println("Charging started ..");
	}
	
	public void braking(){
		if (speed == 0){
			System.out.println("Already stopped ");
		}
		int deceleration = 4;
		if (speed - deceleration < 0){
			speed = 0;
		}
		else{
			speed -= deceleration;
		}
		System.out.println("Braking ");
	}
	
	public void unLocked(){
		if (!isLocked){
			System.out.println("It is already unlocked");
			return
		}
		
	}
}