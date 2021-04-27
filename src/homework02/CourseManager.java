package homework02;

public class CourseManager {
		
		public void addCourse(Course course) {
			System.out.println("Kurs eklendi "+ course.name);
		}
		public void deleteCourse(Course course) {
			System.out.println("Kurs silindi "+ course.name);
		}
		public void updateCourse(Course course) {
			System.out.println("Kurs guncellendi "+ course.name);
		}
	
	
	
}
