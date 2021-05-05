package nLayeredDEmo.business.concretes;

import java.util.List;

import nLayeredDEmo.business.abstracts.ProductService;
import nLayeredDEmo.core.LoggerService;
import nLayeredDEmo.dataAccess.abstracts.ProductDao;

import nLayeredDEmo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;
	
	
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId()==1) {
			System.out.println("Bu kategoride urun kabul edilmiyor");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Urun eklendi"+ product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
