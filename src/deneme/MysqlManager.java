package deneme;

public class MysqlManager extends BaseDatabaseManager {

	public void insertData() {
		System.out.println("MySql ile Ekleme Yapıldı");
	}
	
	public void updateData() {
		System.out.println("MySql ile Güncelleme Yapıldı");
	}
		
	public void deleteData() {
		System.out.println("MySql ile Silme Yapıldı");
	}
	
	public void selectData() {
		System.out.println("MySql ile Select Yapıldı");
	}
	
}
