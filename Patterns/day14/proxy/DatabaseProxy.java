package day14.proxy;

public class DatabaseProxy implements Database{
    private RealDatabase realDatabase;
    private String userRole;

    public DatabaseProxy(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void query(String sql) {
        if (userRole.equals("ADMIN")) {
            if (realDatabase == null) {
                realDatabase = new RealDatabase();
            }
            realDatabase.query(sql);
        } else {
            System.out.println("Access denied: You do not have permission to execute this query.");
        }
    }
}
