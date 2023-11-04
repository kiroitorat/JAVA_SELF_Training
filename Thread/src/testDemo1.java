public class testDemo1 extends Thread {
    private String threadName;

    public testDemo1(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i>0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public static void main(String args[]) {
    	testDemo1 t1 = new testDemo1("Thread 1");
        t1.start();

        testDemo1 t2 = new testDemo1("Thread 2");
        t2.start();
    }
}

