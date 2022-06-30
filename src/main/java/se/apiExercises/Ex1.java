package se.apiExercises;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 * Exercise 1:
 * Create a LocalDate of the current day and print it out
 */
public class Ex1 {
    public static void main(String[] args) {
        LocalDate currentDay = LocalDate.now();
        System.out.println("currentDay = " + currentDay);
    }
}
