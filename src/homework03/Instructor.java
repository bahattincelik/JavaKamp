package homework03;

public class Instructor extends User {
	
	public Instructor(int id, String firstName, String lastName,double salary) {
		super(id, firstName, lastName);
		this.salary=salary;
	}

	private double salary;

	public double getSalary() {
		return salary;
	}
}
