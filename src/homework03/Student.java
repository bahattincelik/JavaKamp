package homework03;

public class Student extends User{
	
	public Student(int id, String firstName, String lastName,String email) {
		super(id, firstName, lastName);
		this.email=email;
	}
	
	private String email;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
