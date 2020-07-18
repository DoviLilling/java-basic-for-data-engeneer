package home_work.lab5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class SoldierServiceImplTest {




    private SoldierService service;



    public SoldierServiceImplTest() throws Exception {
        service = new SoldierServiceImpl();
        service.addSoldier(new Soldier("",22));
        service.addSoldier(new Soldier("",28));
        service.addSoldier(new Soldier("",25));
    }


    @Test
    public void maxAge() {


        int x = service.maxAge();

        Assert.assertEquals(28, x);

    }

    @Test
    public void avgAge() {
        double x = service.avgAge();
        Assert.assertEquals(25,x,0);

    }

    @Test
    public void sumAge() {
        int x = service.sumAge();
        Assert.assertEquals(75,x);

    }


}




