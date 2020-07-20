package doviHW.com.hw20200708;

import java.util.List;

public class SoldierService {

    public static double getSumAge(List<Soldier> pSoldiers) {
        double vSum = 0;
        for (Soldier p_soldier : pSoldiers){
            vSum += p_soldier.getAge();
        }
        return vSum;
    }

    public static double getAvgAge(List<Soldier> pSoldiers){
        return (getSumAge(pSoldiers) / (double) pSoldiers.size());
    }

    public static int getMaxAge(List<Soldier> pSoldiers){
        int vMax = 0;
        String vName = "";
        for (Soldier pSoldier : pSoldiers) {
            vMax = Math.max(pSoldier.getAge(), vMax);
            vName = (vMax == pSoldier.getAge() ? pSoldier.getName() : vName);
        }
        System.out.println("The oldest soldier is " + vName + " aging " + vMax + " years. Old wine is the best wine!");
        return vMax;
    }

}
