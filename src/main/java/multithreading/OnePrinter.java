package multithreading;

/**
 * @author Evgeny Borisov
 */


//todo create 200 thread, put it in a list, make them start check if they are blocking each other, not because they run synchornized, but because 200 threads not really can run simultaniosly, because we don't have so many cores


public class OnePrinter implements Runnable {
    private long x;
    private boolean moreWorkToDo = true;

    public long getX() {
        return x;
    }

    public void setMoreWorkToDo(boolean moreWorkToDo) {
        this.moreWorkToDo = moreWorkToDo;

    }

    public void printOne() throws InterruptedException {
        while (moreWorkToDo) {

            x++;
//            System.out.println(x);
        }
        System.out.println("the end " + x);


    }

    @Override
    public void run() {

        try {
            printOne();
        } catch (InterruptedException e) {
            moreWorkToDo = false;
        }
        System.out.println("print one ended");
    }
}
