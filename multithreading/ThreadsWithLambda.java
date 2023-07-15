package multithreading;

public class ThreadsWithLambda {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                System.out.println("Hi " + Thread.currentThread().getPriority());
    
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }, "Hi Thread");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }, "Hello Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e){}
        t2.start();

        //System.out.println(t1.isAlive()); // check if the thread is alive

        // the .join() method will wait for the threads to stop so the main method can execute 
        t1.join();
        t2.join();

        //System.out.println(t1.isAlive());
        
        System.out.println("Bye");
    }
}
