package homework03;

public class Instructor extends User {
	
	public Instructor(int id, String firstName, String lastName,double salary) {
		super(id, firstName, lastName);
		
	}

	private double salary;

	public double getSalary() {
		return salary;
	}
}
