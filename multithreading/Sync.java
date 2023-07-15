package multithreading;

public class Sync {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
     
        Thread t1 = new Thread(new Runnable() {

            public void run() {

                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {

            public void run() {

                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }

            }
        });


        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count " + c.count);
    }
}

class Counter {
    int count;

    // only one thread can use it at a time
    public synchronized void increment() {
        count++;
    }
}