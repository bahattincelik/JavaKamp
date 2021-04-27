package homework02;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User (1,"Bahattin", "Celik", "bahattinclk@gmail.com");
		User user2 = new User (2,"Seyda", "Celik", "seydalsan@gmail.com");
		
		User[] users = {user1, user2};
		
		for (User user : users) {
			System.out.println(user.firstName+" "+user.lastName);
		}
		System.out.println();
		
		Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı ","Engin Demirog","(JAVA & REACT)");
		Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı ","Engin Demirog","(C# & ANGULAR)");

		Course [] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name+" "+course.detail);
		}
		System.out.println();
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course2);
		courseManager.deleteCourse(course1);
		courseManager.updateCourse(course1);
	}

}
