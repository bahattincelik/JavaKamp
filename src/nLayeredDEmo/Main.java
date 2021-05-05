package nLayeredDEmo;

import nLayeredDEmo.business.abstracts.ProductService;
import nLayeredDEmo.business.concretes.ProductManager;
import nLayeredDEmo.core.JLoggerManagerAdapter;
import nLayeredDEmo.dataAccess.concretes.AbcProductDao;
import nLayeredDEmo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		//Spring IoC ile cozulecek
		ProductService productService = new ProductManager(new AbcProductDao(),
				new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		
		productService.add(product);
	}

}
