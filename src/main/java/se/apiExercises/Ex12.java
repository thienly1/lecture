package se.apiExercises;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Exercise 12
  Using DateTimeFormatter format LocalTime from current time and print it out as following pattern:
  10:32:53
 */

public class Ex12 {
    public static void main(String[] args) {

       LocalTime currentTime = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);

       System.out.println("currentTime = " + currentTime);

    }
}
