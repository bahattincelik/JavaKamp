package homework03;

public class Main {

	public static void main(String[] args) {
		User user = new Student(1, "Bahattin", "Celik","bahattinclk@gmail.com");
		UserManager userManager = new StudentManager();
		userManager.showInfos(user);
	}

}
