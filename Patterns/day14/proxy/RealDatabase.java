package day14.proxy;

public class RealDatabase implements Database{
    // This class represents the real subject
    public RealDatabase(){
        // Simulate a connection to a database
        System.out.println("Connecting to the database...");
    }

    @Override
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
