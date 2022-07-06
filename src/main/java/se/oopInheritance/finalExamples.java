package se.oopInheritance;

public class finalExamples {
    //Can never point to another Person once assigned.

    public static void main(String[] args) {
        final int FINAL_NUMBER = 10;
        // FINAL_NUMBER = 100; //compile error, this is final, immutable

        final String[] names ;
        names = new String[10]; // first time initialization.
        //names = new String[20]; // compile error, can not change (mutate) after initializing above

        names[0] = "simon";
        names[0] = "erik";// allowed because content in an array is mutable

        //Can never point to another Person once assigned.
        final Person person;

    }

}
