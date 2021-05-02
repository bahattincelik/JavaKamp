package abstracts;

public class MongoDataBase extends AbstractDataBase {

	@Override
	void update() {
		System.out.println("MongoDb Guncelledi");
		
	}

	@Override
	void get() {
		System.out.println("MongoDb veileri aldi");
		
	}

}
