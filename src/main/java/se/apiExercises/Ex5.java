package se.apiExercises;

import java.time.LocalDate;

/**
 * Exercise5
 * The date time api provides enums for time units such as day and month. Create a LocalDate of 1945-
 * 05-08 and extract the day of week for that date.
 */

public class Ex5 {
    public static void main(String[] args) {
        LocalDate oneDay = LocalDate.of(1945,5,8);
        System.out.println(oneDay.getDayOfWeek());
    }
}
