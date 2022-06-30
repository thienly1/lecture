package se.apiExercises;

import java.time.format.DateTimeFormatter;

/**
 * Exercise 14
 * Using DateTimeFormatter format the LocalDateTime object from exercise 11 to a String that should
 * look tile this: torsdag 5 april 10:00
 */

public class Ex14 {
    public static void main(String[] args) {
        System.out.println(Ex13.pass().format(DateTimeFormatter.ofPattern("eeee dd LLLL 'T'hh:mm")));

    }
}
