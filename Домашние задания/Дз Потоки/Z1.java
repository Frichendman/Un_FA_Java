public class Z1 {

    public static class Potoc extends Thread {
        String n;
        Potoc(String n) {
            this.n = n;
        }

        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(n);
            }
        }

    }
    public static void main(String[] args) {
        Potoc t = new Potoc("Буква");
        t.start();

    }
}