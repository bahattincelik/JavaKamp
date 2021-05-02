package kahveUygulamasiAbstractInterface;



public class StarbucksCustomerManager extends BaseCustomerManager {

	ICustomerCheckService customerCheckService;
	
	
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.CheckIfReelPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid Person");
		}
		
		
		//CheckIfReelPerson(customer);
		
	}

	private void CheckIfReelPerson(Customer customer) {
		
		
	}
	
}
