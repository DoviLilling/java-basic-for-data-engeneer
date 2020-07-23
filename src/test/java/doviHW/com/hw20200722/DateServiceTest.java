package doviHW.com.hw20200722;

import junit.framework.TestCase;
import org.junit.Assert;

public class DateServiceTest extends TestCase {

    public void testLastDayOfMonth() {
        Assert.assertEquals(31, DateService.lastDayOfMonth(2020, 1));
        Assert.assertEquals(29, DateService.lastDayOfMonth(2020, 2));
        Assert.assertEquals(28, DateService.lastDayOfMonth(2021, 2));
        Assert.assertEquals(31, DateService.lastDayOfMonth(2020, 3));
        Assert.assertEquals(30, DateService.lastDayOfMonth(2020, 4));
    }

    public void testAddDays() {
        DoviDate original = new DoviDate(2020, 1, 1);
        DoviDate newD = DateService.addDays(original, 365);
        Assert.assertEquals(newD, new DoviDate(2020, 12, 31));
        newD.modify(2019, 1, 1);
        System.out.println(newD.getDateAsString());
        newD = DateService.addDays(newD, 365);
        System.out.println(newD.getDateAsString());
        Assert.assertEquals(newD, new DoviDate(2020, 1, 1));
    }

    public void testAddMonths() {
        DoviDate original = new DoviDate(2020, 1, 31);
        DoviDate newD = DateService.addMonths(original, 1);
        Assert.assertEquals(newD, new DoviDate(2020, 2, 29));
        original.modify(2020, 3, 31);
        newD = DateService.addMonths(original, 1);
        Assert.assertEquals(newD, new DoviDate(2020, 4, 30));
    }

    public void testAddYears() {
        DoviDate original = new DoviDate(2019, 2, 28);
        DoviDate newD = DateService.addYears(original, 1);
        Assert.assertEquals(newD, new DoviDate(2020, 2, 28));
        original = new DoviDate(2020, 2, 29);
        newD = DateService.addYears(original, 1);
        Assert.assertEquals(newD, new DoviDate(2021, 2, 28));
    }

    public void testDaysDiff() {
        DoviDate original = new DoviDate(2019, 2, 28);
        DoviDate newD = new DoviDate(2019, 2, 28);
        Assert.assertEquals(0, DateService.daysDiff(original, newD));
        original = new DoviDate(2019, 2, 28);
        newD = new DoviDate(2021, 2, 28);
        Assert.assertEquals(365*2+1, DateService.daysDiff(original, newD));
    }

    public void testYearsDiff() {
        DoviDate original = new DoviDate(2019, 2, 28);
        DoviDate newD = new DoviDate(2019, 2, 28);
        Assert.assertEquals(0, DateService.yearsDiff(original, newD));
        original = new DoviDate(2019, 2, 28);
        newD = new DoviDate(2021, 2, 28);
        Assert.assertEquals(2, DateService.yearsDiff(original, newD));
    }
}