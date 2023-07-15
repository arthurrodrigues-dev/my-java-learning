package multithreading;

public class myThread {
    public static void main(String[] args) {
        Hi obj1 = new Hi(); 
        Hello obj2 = new Hello();

        // we use .start() when our threads extends Thread
        // obj1.start();
        // obj2.start();

        // when implementing Runnable
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();
    }
}
// in order to extends another class, since java does not support multiple inheritance, we can implements the Runnable interface
class Hi implements Runnable{
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hi");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Hello implements Runnable{
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}