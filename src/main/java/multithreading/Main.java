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


        t1.start();

        t2.setDaemon(true);
        t2.start();

        Thread.sleep(1000);
        onePrinter.setMoreWorkToDo(false);
        Thread.sleep(1);
        System.out.println(TwoPrinter.x);
        System.out.println("the end of app");



    }
}
