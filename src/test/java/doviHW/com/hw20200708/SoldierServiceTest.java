package doviHW.com.hw20200708;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SoldierServiceTest extends TestCase {
    private List<Soldier> soldiers = new ArrayList<>();

    public SoldierServiceTest() throws Exception{
        soldiers.add(new Soldier(10));
        soldiers.add(new Soldier(20, "Grunt 20"));
        soldiers.add(new Soldier(40, "Grunt 40"));
        soldiers.add(new Soldier(30, "Grunt 30"));
    }

    public void testGetSumAge() {
        double x = SoldierService.getSumAge(soldiers);
        Assert.assertEquals(100, x, 0);
    }

    public void testGetAvgAge() {
        double x = SoldierService.getAvgAge(soldiers);
        Assert.assertEquals(25, x, 0);
    }

    public void testGetMaxAge() {
        int x = SoldierService.getMaxAge(soldiers);
        Assert.assertEquals(40, x, 0);
    }
}