package doviHW.com.hw20200708;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        List<Soldier> soldiers = new ArrayList<>();
        soldiers.add(new Soldier(10));
        soldiers.add(new Soldier(20, "Grunt 20"));
        soldiers.add(new Soldier(40, "Grunt 40"));
        soldiers.add(new Soldier(30, "Grunt 30"));

        System.out.println("Average: " + SoldierService.getAvgAge(soldiers));
        System.out.println("Sum: " + SoldierService.getSumAge(soldiers));
        System.out.println("Max: " + SoldierService.getMaxAge(soldiers));
    }
}
