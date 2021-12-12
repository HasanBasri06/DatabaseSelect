package deneme;

public class Main {

	public static void main(String[] args) {
		
		
		DatabaseUI databaseUI = new DatabaseUI();
		databaseUI.selectDatabase(new PostgresqlManager());

	}

}
