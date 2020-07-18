package home_work.lab5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class SoldierServiceImpl implements SoldierService {

    private List<Soldier> soldiers = new ArrayList<>();


    @Override
    public void addSoldier(Soldier soldier) {
        this.soldiers.add(soldier);
    }


    @Override
    public int maxAge() {
        int max = 0;
        for (Soldier soldier : this.soldiers) {
            if (soldier.getAge() > max) {
                max = soldier.getAge();
            }
        }
        return max;
    }

    @Override
    public double avgAge() {
        return ((double) this.sumAge()) / soldiers.size();
    }

    @Override
    public int sumAge() {
        int totalAge = 0;


        for (Soldier soldier : soldiers) {
            totalAge += soldier.getAge();
        }

        return totalAge;
    }

    @Override
    public void printAllNames() {
        for (Soldier soldier : soldiers) {
            System.out.println(soldier.getName());
        }
    }
}












