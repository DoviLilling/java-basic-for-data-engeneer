package DoviHW.com.HW20200708;

import java.util.List;

public class SoldierService {

    public static double getSumAge(List<Soldier> p_soldiers) {
        double v_sum = 0;
        for (Soldier p_soldier : p_soldiers){
            v_sum += p_soldier.getAge();
        }
        return v_sum;
    }

    public static float getAvgAge(List<Soldier> p_soldiers){
        return ((float) getSumAge(p_soldiers) / (float) p_soldiers.size());
    }

    public static int getMaxAge(List<Soldier> p_soldiers){
        int v_max = 0;
        String v_name = "";
        for (Soldier p_soldier : p_soldiers) {
            v_max = Math.max(p_soldier.getAge(), v_max);
            v_name = (v_max == p_soldier.getAge() ? p_soldier.getName() : v_name);
        }
        System.out.println("The oldest soldier is " + v_name + " aging " + v_max + " years. Old wine is the best wine!");
        return v_max;
    }

}
