package doviHW.com.hw20200712;

import java.util.ArrayList;
import java.util.List;

public class SoldierService {

    private List<Soldier> soldiers = new ArrayList<>();

    public void addSoldier(Soldier pNewSoldier){
        if  (this.soldiers.contains(pNewSoldier)){
            System.out.println("Soldier " + pNewSoldier.getMilitaryID() + " already exists.");
        } else {
            this.soldiers.add(pNewSoldier);
            System.out.println("Soldier " + pNewSoldier.getMilitaryID() + " added.");
        }
    }

    public double getSumAge() {
        double vSum = 0;
        for (Soldier soldier : soldiers){
            vSum += soldier.getAge();
        }
        return vSum;
    }

    public float getAvgAge(){
        return ((float) getSumAge() / (float) soldiers.size());
    }

    public int getMaxAge(){
        int vMax = 0;
        String vName = "";
        for (Soldier soldier : soldiers) {
            vMax = Math.max(soldier.getAge(), vMax);
            vName = (vMax == soldier.getAge() ? soldier.getName() : vName);
        }
        System.out.println("The oldest soldier is " + vName + " aging " + vMax + " years. Old wine is the best wine!");
        return vMax;
    }

    public void printAllNames(){
        for (Soldier soldier : soldiers) {
            System.out.println(soldier.getName());
        }
    }

}
