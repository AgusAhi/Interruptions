public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main " + i);
            Thread.sleep(1000);
        }
        thread.interrupt();
        for (int i = 5; i < 20; i++) {
            System.out.println("Main " + i);
            thread.sleep(1000);
        }
    }
}
