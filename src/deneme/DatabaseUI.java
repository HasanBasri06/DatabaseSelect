package deneme;

public class DatabaseUI {

	public void selectDatabase(BaseDatabaseManager baseDatabaseManager) {
		baseDatabaseManager.deleteData();
		baseDatabaseManager.insertData();
		baseDatabaseManager.selectData();
		baseDatabaseManager.updateData();
	}
	
}
