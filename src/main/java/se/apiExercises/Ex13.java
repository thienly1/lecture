package se.apiExercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Exercise 13
 Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00.
 */

public class Ex13 {
    public static void main(String[] args) {
        pass();

        System.out.println("dateTime = " + pass().format(DateTimeFormatter.ofPattern("y-MM-dd 'T' hh.mm")));
    }
    public static LocalDateTime pass (){
        LocalDateTime dateTime = LocalDateTime.parse("2018-04-05T10:00");
        return dateTime;

    }
}
