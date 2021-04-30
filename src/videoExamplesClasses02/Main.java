package videoExamplesClasses02;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name="Laptop";
		product.id=1;
		product.description="Asus";
		product.price=5000;
		product.stockAmount=3;
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}

}
