package day16.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            CacheManager cache = CacheManager.getInstance();
            String key = "key-"+Thread.currentThread().getName();
            cache.put(key, "value-"+Thread.currentThread().getName());

            System.out.println(Thread.currentThread().getName() + ": " + cache.get(key));
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        CacheManager cache = CacheManager.getInstance();
        System.out.println("Main Thread: key-Thread-1 = " + cache.get("key-Thread-1"));
        cache.put("shared-key", "shared-value");
        System.out.println("Main Thread: shared-key = " + cache.get("shared-key"));
    }
}
