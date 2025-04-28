package lk.ijse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //t1
        //for-loop-5-A
        Thread t1 =new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        //t2
        //for-loop-5-B
        Thread t2 =new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        //t1 start
        t1.start();
        System.out.println(t1.isAlive());
        Thread.sleep(10);
        //t2 start
        t2.start();
        System.out.println(t1.isAlive());

        t1.join();
        System.out.println(t1.isAlive());
        t2.join();
        System.out.println(t1.isAlive());
        //sout(Byee!....)
        System.out.println("Byee!...");

        //out-put-should-be-like
        //A/B*5
        //Byee
    }
}