package multithreading;

import heroes.RandomUtil;

/**
 * @author Evgeny Borisov
 */



//todo create 200 thread, put it in a list, make them start check if they are blocking each other, not because they run synchornized, but because 200 threads not really can run simultaniosly, because we don't have so many cores


public class OnePrinter implements Runnable {
    private long x;
    private boolean moreWorkToDo = true;

    public long  getX() {
        return x;
    }

    public void setMoreWorkToDo(boolean moreWorkToDo) {
        this.moreWorkToDo = moreWorkToDo;
        System.out.println(x);
    }

    public void printOne() throws InterruptedException {
        while (moreWorkToDo) {
            System.out.println(111111);
            if (RandomUtil.between(0,3000)==17) {
                System.out.println(moreWorkToDo);
            }
            x++;

        }


    }

    @Override
    public void run() {

        try {
            printOne();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("print one ended");
    }
}
