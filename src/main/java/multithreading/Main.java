package multithreading;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        OnePrinter onePrinter = new OnePrinter();
        TwoPrinter twoPrinter = new TwoPrinter();




        Thread t1 = new Thread(onePrinter, "one printer thread");
        Thread t2 = new Thread(twoPrinter, "two printer thread");
        t2.setDaemon(true);

        Thread.sleep(5000);
        t1.start();

        t2.start();

        Thread.sleep(3000);
        onePrinter.setMoreWorkToDo(false);
        System.out.println("the end");


    }
}
