public class Main {
    public static void main(String[] args) {
        Transaction i1 = new Transaction("first");
        Thread t1 = new Thread(i1);
        Transaction i2 = new Transaction("second");
        Thread t2 = new Thread(i2);

        t1.start();
        t2.start();
    }
}