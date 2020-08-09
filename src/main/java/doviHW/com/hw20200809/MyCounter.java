package doviHW.com.hw20200809;

public class MyCounter implements Runnable{
    private final int step;
    private int counter = 0;

    public MyCounter(int step) {
        this.step = step;
    }

    public void run() {
        while (true) {
            counter += step;
        }
/*        try {
            Thread.sleep(counter*500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
