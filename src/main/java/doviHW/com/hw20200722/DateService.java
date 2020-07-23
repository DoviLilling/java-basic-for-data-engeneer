package doviHW.com.hw20200722;

/**
 * @author Dovi Lilling
 */

public class DateService{

    public static int lastDayOfMonth(int pYear, int pMonth){
        if (!DoviDate.isShortMonth(pMonth)) {return 31;}
        if (pMonth == 2) { return DoviDate.isLeapYear(pYear) ? 29 : 28;}
        return 30;
    }

    public static int lastDayOfMonth(DoviDate pDate){
        if (!pDate.isShortMonth()) {return 31;}
        if (pDate.getMonth() == 2) { return pDate.isLeapYear() ? 29 : 28;}
        return 30;
    }

    public static DoviDate addDays(DoviDate pDoviDate, int pDays){
        DoviDate retDate = new DoviDate(pDoviDate);
        int day = retDate.getDay();
        int month = retDate.getMonth();
        int year = retDate.getYear();
        int daysToAdd = pDays;
        while (daysToAdd > 0){
            System.out.println("day = " + day + " month: " + month + " year: " + year);
            System.out.println("daysToAdd = " + daysToAdd);
            if(day + daysToAdd > lastDayOfMonth(year, month)){
                System.out.println(">");
                daysToAdd -= (lastDayOfMonth(year, month) - day + 1); // days left to EOM + 1
                day = 1;
                month++;
                if (month > 12){
                    System.out.println("month");
                    year++;
                    month -= 12;
                    System.out.println("year, month = " + year + " " + month);
                }
            } else {
                System.out.println("else");
                day += daysToAdd;
                daysToAdd = 0;
            }
        }
        retDate.modify(year, month, day);
        return retDate;
    }

    public static DoviDate addMonths(DoviDate pDoviDate, int pMonths)
    {
        int updatedYear = pDoviDate.getYear() + (pMonths / 12);
        int updatedMonth = pDoviDate.getMonth() + pMonths % 12;
        int lastDayOfUpdatedMonth = lastDayOfMonth(updatedYear, updatedMonth);
        DoviDate retDate = new DoviDate(pDoviDate);
        if (retDate.getDay() == lastDayOfMonth(retDate) && retDate.getDay() > lastDayOfUpdatedMonth){
            retDate.modify(updatedYear, updatedMonth, lastDayOfUpdatedMonth);
        } else {
            retDate.modify(updatedYear, updatedMonth, 0);
        }
        return retDate;
    }

    public static DoviDate addYears(DoviDate pDoviDate, int pYears)
    {
        return addMonths(pDoviDate, pYears * 12);
        /*
        DoviDate retDate = new DoviDate(pDoviDate);
        if(pDoviDate.getMonth() == 2 && pDoviDate.getDay() == 29 &&
                !DoviDate.isLeapYear(pDoviDate.getYear() + pYears)){ // Feb 29th, addition will set to to non-leap-year
            retDate.modify(pDoviDate.getYear() + pYears, 0, lastDayOfMonth(pDoviDate.getYear() + pYears, 2));
        } else { retDate.modify(pDoviDate.getYear() + pYears, 0, 0); }
        return retDate;
         */
    }

    public static int daysDiff(DoviDate pDateStart, DoviDate pDateEnd){
        int daysDiff = 0;
        DoviDate vDateToMatch = new DoviDate(pDateStart);
        if (vDateToMatch.getYear() < pDateEnd.getYear()){
            for (int i = vDateToMatch.getYear(); i < pDateEnd.getYear(); i++)
                daysDiff += DoviDate.isLeapYear(i) ? 366 : 365;
            vDateToMatch.modify(pDateEnd.getYear(), 0, 0);
        }
        if (vDateToMatch.getMonth() < pDateEnd.getMonth()){
            for (int i = vDateToMatch.getMonth(); i < pDateEnd.getMonth(); i++)
                daysDiff += lastDayOfMonth(vDateToMatch.getYear(), i);
        } else {
            for (int i = pDateEnd.getMonth(); i < vDateToMatch.getMonth(); i++)
                daysDiff -= lastDayOfMonth(vDateToMatch.getYear(), i);
        }
        daysDiff += pDateEnd.getDay() - vDateToMatch.getDay();
        return daysDiff;
    }

    public static int yearsDiff(DoviDate pDateStart, DoviDate pDateEnd){
        return pDateEnd.getYear() - pDateStart.getYear();
    }
}