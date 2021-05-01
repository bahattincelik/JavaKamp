package homework03;

public class Main {

	public static void main(String[] args) {
		User student = new Student(1, "Bahattin", "Celik","bahattinclk@gmail.com");
		UserManager user1 = new StudentManager();
		user1.showInfos(student);
		
		System.out.println();
		
		User instructor = new Instructor(2, "Bahattin", "Celik",5000);
		UserManager user2 = new InstructorManager();
		user2.showInfos(instructor);
	}

}
