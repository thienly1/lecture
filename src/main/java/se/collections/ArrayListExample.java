package se.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 1. ArrayList can contain duplicate elements.
 2. ArrayList maintains insertion order.
 4. ArrayList allows random access because it works at the index base.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ex1();
    }
    private static void ex1(){
        List<String> string = new ArrayList<>();

        string.add("Java");
        string.add("Group");
        string.add("43");
        string.add("!");
        string.add(0,"Hello");

        System.out.println(string); //[Hello, Java, Group, 43, !]
    }
}
