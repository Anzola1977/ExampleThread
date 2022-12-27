public class MainThread extends Thread{
        String str;

        public MainThread(String str) {
            this.str = str;
        }

        @Override
        public void run() {
                System.out.print(str);
            }

    public static void main(String[] args) {
        MainThread t1 = new MainThread("Thread1");
        MainThread t2 = new MainThread("Thread2");
        MainThread t3 = new MainThread("Thread3");
        t1.start();
        t3.run(); // 1
    }
}
