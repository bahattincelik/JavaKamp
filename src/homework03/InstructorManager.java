package homework03;

public class InstructorManager implements UserManager {

	private Instructor instructor;
	
	
	
	
	
	public InstructorManager(Instructor instructor) {
		super();
		this.instructor = instructor;
	}





	@Override
	public void showInfos() {
		System.out.println( instructor.getSalary());
		System.out.println(instructor.getId());
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName());	
		
	}



	
	
}
