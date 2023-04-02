public class Z2 {

    public static class Run implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if (i % 10 == 0) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        Run r1 = new Run();
        Run r2 = new Run();
        Run r3 = new Run();
        r1.run();
        r2.run();
        r3.run();
    }
}
