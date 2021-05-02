package interfacesOfImportant;



public class Main {

	public static void main(String[] args) {
		DataBaseManager manager = new DataBaseManager();
		manager.addDataBase(new MongoDataBase());
		manager.addDataBase(new MySqlDataBase());
	}

}
