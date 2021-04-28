package day03_inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer bahattin = new IndividualCustomer();
		bahattin.customerNumber="12345";
		
		CorporateCustomer halkbank = new CorporateCustomer();
		halkbank.customerNumber="99876";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="99999";
		
		CustomerManager customerManager =new CustomerManager();
		Customer[] customers = {bahattin, abc, halkbank};
		
		customerManager.addMultiple(customers);
		
//		CustomerManager customerManager =new CustomerManager();
//		customerManager.add(halkbank);
//		customerManager.add(bahattin);
//		customerManager.add(abc);

	}

}
