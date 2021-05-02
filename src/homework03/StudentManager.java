package homework03;

public class StudentManager implements UserManager{
	
	private Student student;
	

	public StudentManager(Student student) {
		super();
		this.student = student;
	}



	@Override
	public void showInfos() {
		System.out.println("show ınfos çalıştı");
		System.out.println( student.getEmail());
		System.out.println(student.getId());
		System.out.println(student.getFirstName()+" "+student.getLastName());		
	}









}
