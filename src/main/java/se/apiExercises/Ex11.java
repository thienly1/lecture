package se.apiExercises;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Exercise 11
 * Create a LocalTime object from a String using the .parse() method.
 */

public class Ex11 {
    public static void main(String[] args) {
        LocalTime object = LocalTime.parse("09:00");
        System.out.println("object = " + object);
    }
}
