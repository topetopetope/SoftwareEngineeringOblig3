import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;



public class Leap_Year_Or_Not {

    @ParameterizedTest
    @MethodSource("StreamOfYearsDividableBy4not100")
    public void Year_Is_Dividable_by_4_but_not_100(int year) {

        assertTrue(Years.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("StreamOfYearsDividableBy400")
    public void Year_Is_Dividable_by_400(int year) {

        assertTrue(Years.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("StreamOfYearsNotDividableBy4")
    public void Year_is_not_dividable_by_4(int year) {

        assertFalse(Years.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("StreamOfYearsDividableBy100Not400")
    public void Year_is_dividable_by_100_but_not_400(int year) {

        assertFalse(Years.isLeapYear(year));
    }





    // sends in a stream of years dividable by 4, but not by 100
    public static Stream StreamOfYearsDividableBy4not100 (){
        return Stream.of(
                Arguments.of(2012),
                Arguments.of(2024),
                Arguments.of(2020)
        );
    }

    // sends in a stream of years dividable by 400
    public static Stream StreamOfYearsDividableBy400 (){
        return Stream.of(
                Arguments.of(2400),
                Arguments.of(2000)
        );
    }

    // sends in a stream of years not dividable by 4
    public static Stream StreamOfYearsNotDividableBy4 (){
        return Stream.of(
                Arguments.of(1990)
        );
    }

    // sends in a stream of years dividable by 100, but not 400
    public static Stream StreamOfYearsDividableBy100Not400 (){
        return Stream.of(
                Arguments.of(1700),
                Arguments.of(1800),
                Arguments.of(1900),
                Arguments.of(2100)
        );
    }
}