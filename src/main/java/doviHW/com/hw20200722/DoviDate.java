package doviHW.com.hw20200722;

/**
 * @author Dovi Lilling
 */

public class DoviDate {
    private int year;
    private int month;
    private int day;
    static final String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static final int[] shortMonths = {2, 4, 6, 9, 11};

    public DoviDate(int pYear, int pMonth, int pDay) {
        if (!modify(pYear, pMonth, pDay)) {
            System.out.println("Not a valid date! Date created but not set.");
        }
    }

    public DoviDate(DoviDate pDoviDate) {
        set(pDoviDate);
    }

    public void set(DoviDate pDoviDate) {
        this.year = pDoviDate.getYear();
        this.month = pDoviDate.getMonth();
        this.day = pDoviDate.getDay();
    }

    public boolean modify(int pYear, int pMonth, int pDay) {
        int vYear = pYear == 0 ? year : pYear;
        int vMonth = pMonth == 0 ? month : pMonth;
        int vDay = pDay == 0 ? day : pDay;
        if (!checkDate(vYear, vMonth, vDay)) {
            return false;
        }
        this.year = vYear;
        this.month = vMonth;
        this.day = vDay;
        return true;
    }

    public static boolean checkDate(int pYear, int pMonth, int pDay){
        if (pDay < 1 || pMonth < 1 || pYear < 1) { return false; }
        if (pDay > 31) { return false; }
        if (pMonth > 12) { return false; }
        if (pDay > 30 && isShortMonth(pMonth)){ return false; }
        if (pMonth == 2 && pDay > 29) { return false; }
        return !(pMonth == 2 && !isLeapYear(pYear) && pDay > 28);
    }

    public static boolean isShortMonth(int pMonth) {
        for (int shortMonth : shortMonths) {
            if(pMonth == shortMonth){
                return true;
            }
        }
        return false;
    }

    public boolean isShortMonth() {
        return isShortMonth(month);
    }

    public static boolean isLeapYear(int pYear){
        return !(pYear%4 != 0 && pYear%100 != 0 && pYear%400 != 0);
    }

    public boolean isLeapYear() {
        return isLeapYear(year);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != getClass()){ return false;}
        DoviDate o = (DoviDate) obj;
        return o.getDay() == day && o.getMonth() == month && o.getYear() == year;
    }

    public String getDateAsString() { return day + "-" + getMonthAsString() + "-" + year; }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public String getMonthAsString() {
        return months[month-1];
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}