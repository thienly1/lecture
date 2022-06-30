package se.apiExercises;

import java.time.LocalTime;

/**
 * Exercise 9
 * Create a LocalTime object of the current time.
 */

public class Ex9 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);
    }
}
