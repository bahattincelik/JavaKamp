package homework03;

public class StudentManager implements UserManager{
	
	private Student student;
	

	public StudentManager(Student student) {
		super();
		this.student = student;
	}


	@Override
	public void showInfos() {
		// TODO Auto-generated method stub
		UserManager.super.showInfos();
		System.out.println( student.getEmail());

	}



	









}
