package deneme;

public class PostgresqlManager extends BaseDatabaseManager {
	public void insertData() {
		System.out.println("PostgreSql ile Ekleme Yapıldı");
	}
	
	public void updateData() {
		System.out.println("PostgreSql ile Güncelleme Yapıldı");
	}
		
	public void deleteData() {
		System.out.println("PostgreSql ile Silme Yapıldı");
	}
	
	public void selectData() {
		System.out.println("PostgreSql ile Select Yapıldı");
	}
}
