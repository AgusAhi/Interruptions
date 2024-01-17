public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; 1 < 10_000_000; i++) {
            System.out.println("MyRunnable: " + i);
            if (Thread.interrupted()) {
                System.out.println("MyRunnable interrupted");
                return;
            }
        }
    }
}
