package homework03;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "Bahattin", "Celik","bahattinclk@gmail.com");
		UserManager userManager1 = new StudentManager(student);
		userManager1.showInfos();
		
		System.out.println();
		
		Instructor instructor = new Instructor(2, "Bahattin", "Celik",5000);
		UserManager user2 = new InstructorManager(instructor);
		user2.showInfos();
		
		
		
	}

}
