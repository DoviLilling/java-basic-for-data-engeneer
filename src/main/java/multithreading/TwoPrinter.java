package multithreading;

/**
 * @author Evgeny Borisov
 */
public class TwoPrinter  implements Runnable{
    public static long x;

    public void printTwo() throws InterruptedException {



        while (true) {
           x++;

//            System.out.println(2222);
        }

    }

    @Override
    public void run() {
        try {
            printTwo();
            System.out.println("x = " + x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
