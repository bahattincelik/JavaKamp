package kahveUygulamasiAbstractInterface;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Bahattin", "Celik",
				"27.10.1987", "1234567890") );

	}

}
