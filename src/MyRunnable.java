public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println("MyRunnable" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("My runnable exception");
        }
    }
}
