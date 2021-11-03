public class Years {

    public static boolean isLeapYear(int year) {
        boolean thisIsARealLeapYear;

        boolean dividableBy4 = year % 4 == 0;
        boolean notDividableBy100 = year % 100 != 0;
        boolean dividableBy400 = year % 400 == 0;


        thisIsARealLeapYear = dividableBy4 && notDividableBy100 || dividableBy400;

        return thisIsARealLeapYear;
    }
}