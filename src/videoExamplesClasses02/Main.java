package videoExamplesClasses02;

public class Main {

	public static void main(String[] args) {
		Product product2 = new Product(1,"Laptop","Asus",3000,2,"Siyah");
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		
		product.setDescription("Asus");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setRenk("Siyah");
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
	}

}
