package abstracts;

public class MySqlDataBase extends AbstractDataBase{

	@Override
	void update() {
		System.out.println("Mysql Guncelledi");
		
	}

	@Override
	void get() {
		System.out.println("Mysql veileri aldi");
		
	}

}
