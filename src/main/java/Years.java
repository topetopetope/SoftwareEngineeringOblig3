public class Years {

    public static boolean isLeapYear(int year) {
        boolean thisIsAActualLeapYear;

        boolean dividableBy4 = year % 4 == 0;
        boolean notDividableBy100 = year % 100 != 0;
        boolean dividableBy400 = year % 400 == 0;


        thisIsAActualLeapYear = dividableBy4 && notDividableBy100 || dividableBy400;

        return thisIsAActualLeapYear;
    }
}