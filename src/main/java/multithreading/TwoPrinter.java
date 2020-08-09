package multithreading;

/**
 * @author Evgeny Borisov
 */
public class TwoPrinter  implements Runnable{
    private long x;

    public void printTwo() throws InterruptedException {
        while (true) {
           x++;
            System.out.println(2222);
        }

    }

    @Override
    public void run() {
        try {
            printTwo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
