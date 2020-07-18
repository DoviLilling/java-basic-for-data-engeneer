package doviHW.com.hw20200712;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {

        SoldierService soldiers = new SoldierService();

        soldiers.addSoldier(new Soldier(10, "Grunt 10", 10));
        soldiers.addSoldier(new Soldier(30, "Grunt 30", 30));
        soldiers.addSoldier(new Soldier(40, "Grunt 40", 40));
        soldiers.addSoldier(new Soldier(10, "Grunt 10 Dup", 60));
        soldiers.addSoldier(new Soldier(20, "Grunt 20", 20));

        System.out.println("Average: " + soldiers.getAvgAge());
        System.out.println("Sum: " + soldiers.getSumAge());
        System.out.println("Max: " + soldiers.getMaxAge());
        soldiers.printAllNames();
    }
}
