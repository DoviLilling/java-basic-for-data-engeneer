package doviHW.com.hw20200809;

import java.util.ArrayList;
import java.util.List;

public class MultithreadingMain {
    public static void main(String[] args) {
        List<Thread> threadsList = new ArrayList<>();
        for (int i=0; i < 10; i++){
            threadsList.add(new Thread(new MyCounter(i), "counter " + i));
            threadsList.get(i).start();
        }
    }
}
