package threads;

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 60; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(500); // Adding a delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 59; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(500); // Adding a delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class NumberPrinter {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}

