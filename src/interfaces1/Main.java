package interfaces1;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Student student = new Student();
		
		IDataBase dataBase1 = new Customer();
		IDataBase dataBase2 = new Student();
		
		dataBase1.log();
		dataBase2.log();

	}

}
