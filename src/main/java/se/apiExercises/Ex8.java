package se.apiExercises;

import java.time.LocalDate;
import java.time.Period;

/**
 * Exercise 8
 * Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add
 * the period you created to the current date.
 */

public class Ex8 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        periodTime(currentDate);
        System.out.println(" years: " + periodTime(currentDate).getYears() + ", Months: " + periodTime(currentDate).getMonths() + ", Days: " + periodTime(currentDate).getDays());
    }
    public static Period periodTime(LocalDate date) {
        LocalDate date1 = date.plusYears(4).plusMonths(7).plusDays(29);
        Period period = Period.between(date, date1);
        return period;
    }
}
