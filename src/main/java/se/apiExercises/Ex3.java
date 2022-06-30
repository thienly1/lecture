package se.apiExercises;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * Exercise3:
 * Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO
 * format
 */

public class Ex3 {
    public static void main(String[] args) {
    LocalDate lastMonday = LocalDate.of(2022, Month.JUNE, 27);
        LocalDate [] day = new LocalDate[7];
    for ( int i = 0; i< day.length; i++) {
        day[i] = lastMonday.plusDays(i);
        System.out.println((day[i].format(DateTimeFormatter.ISO_DATE)).toString());

    }





    }

}
