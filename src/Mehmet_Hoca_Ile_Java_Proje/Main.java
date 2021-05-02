package Mehmet_Hoca_Ile_Java_Proje;


public class Main {

	
		public static void main(String[] args) {
			
			Student student1 = new Student(1, "Bahattin", "Celik","bahattinclk@gmail.com");
			UserManager userM1 = new StudentManager();
			userM1.showInfos(student1);
			
			System.out.println();
			
			Instructor instructor = new Instructor(2, "Bahattin", "Celik",5000);
			UserManager user2 = new InstructorManager();
			user2.showInfos(instructor);
		}

	

}
