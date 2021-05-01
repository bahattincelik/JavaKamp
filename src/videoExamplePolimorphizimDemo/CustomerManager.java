package videoExamplePolimorphizimDemo;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager( BaseLogger logger) {
		this.logger = logger;
	}
	public void add() {
		System.out.println("musteri eklendi");
		this.logger.log("Log mesaji");
	}
}
