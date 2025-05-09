package day14.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Database adminDatabase = new DatabaseProxy("ADMIN");
        adminDatabase.query("SELECT * FROM users");

        Database userDatabase = new DatabaseProxy("USER");
        userDatabase.query("SELECT * FROM users");
        adminDatabase.query("UPDATE users SET name='John' WHERE id=1");
    }
}
