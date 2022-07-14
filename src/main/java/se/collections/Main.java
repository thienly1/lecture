package se.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //array-vs-collection;
         traversing_an_collection();
         wrappers_of_Primitives();

    }
    public static void array_vs_collection() {
        // We as developer have All the control with the Array
        // fixed size

        String[] stringsArray = new String[5];
        //Access by id's
        stringsArray[0] = "Hello";
        stringsArray[1] = "Java";
        stringsArray[2] = "Group";
        stringsArray[3] = "43";
        stringsArray[4] = "!";

        System.out.println(stringsArray[0]); //Hello
        System.out.println(Arrays.toString(stringsArray)); //[Hello, Java, Group, 43, !]

        //--------------------------------------------------------
        // ArrayList has Functionality like adding, removing, finding etc..
        ArrayList<String> collectionOfStrings = new ArrayList<>();

        collectionOfStrings.add("Hello");
        collectionOfStrings.add("Java");
        collectionOfStrings.add("Group");
        collectionOfStrings.add("43");
        collectionOfStrings.add("!");

        System.out.println(collectionOfStrings); //[Hello, Java, Group, 43, !]
        System.out.println("collectionOfStrings = " + collectionOfStrings.size()); //5
        System.out.println("collectionOfStrings = " + collectionOfStrings.get(3)); //43
        System.out.println("collectionOfStrings = " + collectionOfStrings.contains("Group")); //true

        String[] arrayToString = collectionOfStrings.toArray(new String[0]);
        System.out.println("arrayToString = " + Arrays.toString(arrayToString)); //arrayToString = [Hello, Java, Group, 43, !]
    }

        public static void traversing_an_collection() {

            // Creating an arraylist of double
            // Doubles is a wrapper of the primitive type of double
            Collection<Double> doubles = new ArrayList<>();

            doubles.add(20.6);
            doubles.add(50d); // 50d: d here show that 50 is double type
            doubles.add(80d);
            doubles.add(40.3);
            doubles.add(20d);

            System.out.println("----for loop-----");
            for (Double d : doubles) {
                System.out.print(d + ","); //20.6,50.0,80.0,

                // in for-loop, we are not allowed to remove the elements in the collection excepting the element which is nearest the end element. ex:
                //if(d == 20.6){
                //    doubles.remove(d);  // its doesn't work.

                //but we can only remove the element nearest the end element
                if (d == 40.3) {
                    doubles.remove(d); // it works but it made the next iteration stop. It can not print out the last element.
                }
            }
            System.out.println("doubles = " + doubles); //doubles = [20.6, 50.0, 80.0, 20.0]

            System.out.println("--- Iterator ---");

            Iterator<Double> iterator = doubles.iterator();

            while (iterator.hasNext()) { // check if Iterator has next element or not, if it is true, continue...
                double numberToRemove = 20.6;
                Double d = iterator.next(); // It returns the element and remove the cursor pointer to the next element.

                //Better when removing
                if (d == numberToRemove) {
                    iterator.remove(); // it removes the last element returned by iterator //20.6
                    continue;
                }
                System.out.println(d); // 20.6 is removed, it printed out 3 next elements: 50.0; 80.0; and 20.0;
            }

            System.out.println("--- Aggregated Operation ---");
            doubles.forEach((d) -> System.out.print(d)); //50.080.020.0
        }

            private static void wrappers_of_Primitives() {
                //Wrappers of primitives
                Double d = 1230.023;
                Integer i = 123;
                Byte b = 41;
                Float f = 123.62F;
                Short s = 123;
                Long l = 9182393L;
                Character c = 's';
                Boolean bool = true;
        }

}
