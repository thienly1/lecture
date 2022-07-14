package se.collections;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        // ex1();
        ex2();

    }

    public static void ex1() {

        HashSet<String> lexiconOfficeVXO = new HashSet<>();
        String simon = "Simon";
        lexiconOfficeVXO.add(simon);
        lexiconOfficeVXO.add("Åsa");
        lexiconOfficeVXO.add("Mehrdad");

        System.out.println("lexiconOfficeVXO = " + lexiconOfficeVXO); //lexiconOfficeVXO = [Åsa, Simon, Mehrdad]

        HashSet<String> lexiconOfficeJKP = new HashSet<>();
        lexiconOfficeJKP.add("Kent");
        lexiconOfficeJKP.add("Marcus");
        lexiconOfficeJKP.add("Martina");
        lexiconOfficeJKP.add("Elirabeth");
        lexiconOfficeJKP.add("Jonas");

        System.out.println("lexiconOfficeJKP = " + lexiconOfficeJKP);

        HashSet<String> lexiconOfficeVXOHistory = new HashSet<>();
        lexiconOfficeVXOHistory.add("Ulf");
        lexiconOfficeVXOHistory.add("Erik L");
        lexiconOfficeVXOHistory.add("Erik S");
        lexiconOfficeVXOHistory.add("Ali");

        //TreeSet Class is always sorted.
        Collection<String> lexiconOffice = new TreeSet<>();
        lexiconOffice.addAll(lexiconOfficeVXO);
        lexiconOffice.addAll(lexiconOfficeJKP);
        lexiconOffice.addAll(lexiconOfficeVXOHistory);

        lexiconOffice.add("Simon"); // no duplicates allowed
        System.out.println("lexiconOffice = " + lexiconOffice); // output is sorted: lexiconOffice = [Ali, Elirabeth, Erik L, Erik S, Jonas, Kent, Marcus, Martina, Mehrdad, Simon, Ulf, Åsa]

        lexiconOffice.removeAll(lexiconOfficeVXOHistory);
        System.out.println("lexiconOffice after removing = " + lexiconOffice);//lexiconOffice after removing = [Elirabeth, Jonas, Kent, Marcus, Martina, Mehrdad, Simon, Åsa]
    }

    public static void ex2() {

        String simon = "Simon";
        System.out.println("simon hashCode= " + simon.hashCode()); //simon hashCode= 79888598

        String simon1 = "Simon";
        System.out.println("simon1 hashCode = " + simon1.hashCode());//simon1 hashCode = 79888598, no Duplication, so simon is simon1;

        Person simon_elbrink = new Person(
                "1956-12-12-1234",
                "Simon Elbrink",
                "simon@lexicon.se",
                LocalDate.parse("1956-12-12"));

        Person simon_elbrink1 = new Person(
                "1956-12-12-1234",
                "Simon Elbrink",
                "simon@lexicon.se",
                LocalDate.parse("1956-12-12"));

        System.out.println("simon_elbrink equals simon_elbrink = " + simon_elbrink.equals(simon_elbrink1)); //true

        System.out.println("simon_elbrink.hashCode() = " + simon_elbrink.hashCode()); //simon_elbrink.hashCode() = -1742192390
        System.out.println("simon_elbrink1.hashCode() = " + simon_elbrink1.hashCode());//simon_elbrink1.hashCode() = -1742192390

        System.out.println(simon_elbrink); //Person{ssn='1956-12-12-1234', name='Simon Elbrink', email='simon@lexicon.se', birthdate=1956-12-12}
        System.out.println(simon_elbrink1);//Person{ssn='1956-12-12-1234', name='Simon Elbrink', email='simon@lexicon.se', birthdate=1956-12-12}

        Set<Person> personSet = new HashSet<>();
        personSet.add(simon_elbrink);
        personSet.add(simon_elbrink1);

        System.out.println(personSet); // If equals and hashCodes are implemented only one of the objects will be stored.
    }
}