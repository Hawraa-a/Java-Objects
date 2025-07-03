public class Student{
	String name = "";
	double gpa = 0.0;
	String major = "";
	int creditHours = 0;
	boolean isStudying = false; 
	
	public void takeExam(int scor, int credits){
		if (scor < 0 || scor > 100){
			System.out.println("Invalid exam scor");
			return;
		}
		if (credits <= 0){
			System.out.println("Credit must be positive ");
			return;
		}
		
		double gradePoints = scor * credits / 100.0 * 4.0;
		gpa = (gpa * creditHours) + gradePoints / (creditHours + credits);
		creditHours += credits;
		
		System.out.println(name + " scor " + scor + "on exam");
		System.out.println("New GPA: " + gpa);
	}
	
	public void checkGrades(){
		if (gpa >= 3.5){
			System.out.println("Excellent performance");
		}
		else if (gpa >= 3.0){
			System.out.println("Good performance");
		}
		else if (gpa >= 2.0){
			System.out.println("Average performance");
		}
		else{
			System.out.println("Need Improvement");
		}
	}
	
	public void studying(int hours){
		if (hours <= 0){
			System.out.println("Invalid study time");
		}
		isStudying = true;
		System.out.println(name + "is studying for " + hours + "hours");
	}
	
}