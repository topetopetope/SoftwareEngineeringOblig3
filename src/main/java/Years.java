public class Years {

    public static boolean isLeapYear(int year) {
        boolean thisIsALeapYear;

        boolean dividableBy4 = year % 4 == 0;
        boolean notDividableBy100 = year % 100 != 0;
        boolean dividableBy400 = year % 400 == 0;


        thisIsALeapYear = dividableBy4 && notDividableBy100 || dividableBy400;

        return thisIsALeapYear;
    }
}