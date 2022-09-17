public class ThreadImpliement implements Runnable {
    public void run() {
        System.out.println("action1");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        ThreadImpliement ti = new ThreadImpliement();
        Thread ti1 = new Thread(ti);
        ti1.start();
    }
}
