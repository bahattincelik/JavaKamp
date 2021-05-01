package homework03;

public class Main {

	public static void main(String[] args) {
		User student = new Student(1, "Bahattin", "Celik","bahattinclk@gmail.com");
		UserManager userManager = new StudentManager();
		userManager.showInfos(student);
		
		
	}

}
