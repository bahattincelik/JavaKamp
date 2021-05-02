package abstracts;

public class Main {

	public static void main(String[] args) {
		AbstractDataBase abstractDataBase1 = new MySqlDataBase();
		AbstractDataBase abstractDataBase2 = new MongoDataBase();
		
		abstractDataBase1.add();
		abstractDataBase2.add();
		abstractDataBase1.update();
		abstractDataBase2.update();
	}

}
