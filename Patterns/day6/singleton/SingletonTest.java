package day6.singleton;

import javax.xml.crypto.Data;

public class SingletonTest {
    public static void main(String[] args){

        Runnable task = () ->{
            DatabaseConnection db = DatabaseConnection.getInstance();
            db.executeQuery("SELECT * FROM user");
            System.out.println("Thread " + Thread.currentThread().getName() + " got instance " + db);
        };

        Thread thread1 = new Thread(task,"thread-1");
        Thread thread2 = new Thread(task,"thread-2");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println("Same Instance? " + (db1==db2));

    }
}
