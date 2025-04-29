package day6.singleton;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private String connectionString;

    private DatabaseConnection(){
        this.connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("DatabaseConnection initialized with: " + connectionString);
    }

    public static DatabaseConnection getInstance(){

        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public  void executeQuery(String query){
        System.out.println("Executing query: " + query + " on " + connectionString);
    }

}
