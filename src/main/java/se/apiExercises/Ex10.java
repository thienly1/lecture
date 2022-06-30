package se.apiExercises;

import java.time.LocalTime;

/**
 * Exercise 10
 * Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
 */

public class Ex10 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        currentTime.getNano();
        System.out.println("nanoseconds of currentTime = " + currentTime.getNano());

    }
}
