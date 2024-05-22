public class Transaction implements Runnable{
    String name;

    public Transaction(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for(int i =5; i>0 ; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println("Error");
        }
        System.out.println("End");

    }
}
