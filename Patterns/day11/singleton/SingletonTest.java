package day11.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            ConfigurationManager config = ConfigurationManager.getInstance();
            System.out.println(Thread.currentThread().getName() + ": API Key = " + config.getSetting("apiKey"));
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ConfigurationManager config = ConfigurationManager.getInstance();
        config.setSetting("apiKey", "new-key-123");
        System.out.println("Main Thread: Updated API Key = " + config.getSetting("apiKey"));
        System.out.println("Main Thread: Timeout = " + config.getSetting("timeout"));
    }
}
