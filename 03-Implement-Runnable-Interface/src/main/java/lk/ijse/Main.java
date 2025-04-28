package lk.ijse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();

        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);

        threadA.start();
        Thread.sleep(10);
        threadB.start();
    }
}

class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}