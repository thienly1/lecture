package se.apiExercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Exercise2:
 * Create a LocalDate of the current day and print it out in the following pattern using
 * DateTimeFormatter: Torsdag 29 mars.
 */

public class Ex2 {
    public static void main(String[] args) {
        LocalDate currentDay = LocalDate.now();
        System.out.println("currentDay = " + currentDay.format(DateTimeFormatter.ofPattern("eeee dd LLLL")));
    }
}
