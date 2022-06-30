package se.apiExercises;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
Exercise6
Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the
month and print it out.
 */

public class Ex6 {
    public static void main(String[] args) {
        date();
        System.out.println(date().getMonth());
    }
    public static LocalDate date (){
        LocalDate currentDate = LocalDate.now().plusYears(10).minus(10, ChronoUnit.MONTHS);
        return currentDate;
    }
}
