public class ThreadeExtension extends Thread {

    public void run() {
        System.out.println("action1");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        ThreadeExtension te = new ThreadeExtension();
        te.start();
    }
}