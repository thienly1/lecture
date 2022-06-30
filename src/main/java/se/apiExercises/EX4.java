package se.apiExercises;

import java.security.spec.PSSParameterSpec;
import java.time.LocalDate;

/**
 * Exercise 4:
 * Create a LocalDate object from a String by using the .parse() method.
 */

public class EX4 {
    public static void main(String[] args) {
        LocalDate sundayThisWeek = LocalDate.parse("2022-07-03");
        System.out.println("sundayThisWeek = " + sundayThisWeek);
    }
}
