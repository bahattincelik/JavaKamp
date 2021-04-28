package day02_oopIntro;

public class Main {
public static void main(String[] args) {
		
//		String [] products = {
//			"Lenovo V14",
//			"Lenovo V15",
//			"HP 5"				
//		};
//		int [] unitsInStock = {
//				3,
//				4,
//				5				
//			};
		
		Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram",10 );		

		
		Product product2 = new Product();		
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		
//		product2.id=2;
//		product2.name="Lenovo V15";
//		product2.unitPrice=16000;
//		product2.detail="32 GB Ram";
//		product2.discount=10;
//		product2.unitPriceAfterDiscount=14400;
		
		
		
		Product product3 = new Product();		
//		product3.id=3;
//		product3.name="Hp"; 
//		product3.unitPrice=10000;
//		product3.detail="8 GB Ram";
//		
		
		Product[] products = {product1,product2,product3};
		
//		for (Product product : products) {
//			
//			System.out.println(product.name);
//		}
				
		System.out.println(products.length);
		
		Category category1= new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2= new Category();
		category2.setId(2);
		category2.setName("Ev/ Bahce");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
				
		ProductManager productManger = new ProductManager();
		productManger.addToCart(product1);
		productManger.addToCart(product2);
		productManger.addToCart(product3);
		
 
	}

}
