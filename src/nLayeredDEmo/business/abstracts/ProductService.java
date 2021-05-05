package nLayeredDEmo.business.abstracts;

import java.util.List;

import nLayeredDEmo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
	
}
