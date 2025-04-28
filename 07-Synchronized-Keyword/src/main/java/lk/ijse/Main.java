package lk.ijse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculation calculation = new Calculation();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                calculation.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                calculation.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Result: " + calculation.num);
    }
}

class Calculation {
    int num;
    public synchronized void increment() {
        num++;
    }
}