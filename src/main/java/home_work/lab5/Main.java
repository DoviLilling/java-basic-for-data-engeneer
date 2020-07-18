package home_work.lab5;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        SoldierService service = new SoldierServiceImpl();
        service.addSoldier(new Soldier("John",50));
        service.addSoldier(new Soldier("Jack",30));
        service.addSoldier(new Soldier("Said",40));
        service.addSoldier(new Soldier("Kate",30));
        service.addSoldier(new Soldier("Soyer",30));

     

        service.printAllNames();

        System.out.println(service.avgAge());
        System.out.println(service.sumAge());
        System.out.println(service.maxAge());


    }
}
