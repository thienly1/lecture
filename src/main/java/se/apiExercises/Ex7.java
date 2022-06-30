package se.apiExercises;

import java.time.LocalDate;
import java.time.Period;

/**
 * Exercise7
 * Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and
 * the date from exercise 5. Print out the elapsed years, months and days.
 */

public class Ex7 {
    public static void main(String[] args) {
        LocalDate myBirthDay = LocalDate.of(2000,6,6);
        Period period = Period.between(myBirthDay, Ex6.date());
        int i = period.getYears();
        System.out.println("elapsed years: " + i+ ", elapsed months: " + period.getMonths() + ", elapsed days: " + period.getDays());


    }
}
