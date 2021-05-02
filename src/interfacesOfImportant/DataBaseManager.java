package interfacesOfImportant;

public class DataBaseManager {
	public void addDataBase(IDataBase database) {
		database.add();
	}
	public void updateDataBase(IDataBase database) {
		database.update();
	}
	public void getDataBase(IDataBase database) {
		database.get();
	}
	public void deleteDataBase(IDataBase database) {
		database.delete();
	}
}
