package se.collections;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Person simon_elbrink = new Person(
                "1956-12-12-1234",
                "Simon Elbrink",
                "simon@lexicon.se",
                LocalDate.parse("1956-12-12"));
        Person erik = new Person(
                "1976-09-11-4321",
                "Erik Svensson",
                "erik@lexicon.se",
                LocalDate.parse("1976-09-11"));
        HashMap<String, Person> personHashMap = new HashMap<>();

        personHashMap.put(simon_elbrink.getSsn(), simon_elbrink);
        personHashMap.put(erik.getSsn(), erik);

        System.out.println("personHashMap.size() = " + personHashMap.size());
        System.out.println("personHashMap.get(1976-09-11-4321) = " + personHashMap.get("1976-09-11-4321"));
        System.out.println("personHashMap = " + personHashMap);

        // print only the key
        for(String key : personHashMap.keySet()){
            System.out.println("key = " + key);
        }
        // print only the value
        for(Person p : personHashMap.values()){
            System.out.println("value = " + p);
        }
        //print key and the values
        for(Map.Entry<String, Person> i : personHashMap.entrySet()){
            System.out.println("key: " + i.getKey() + " Value" + i.getValue());

        }
    }
}
