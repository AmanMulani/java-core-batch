package src.collections;

import java.util.*;

public class ExampleHashSets {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>(); 

        //Add operation
        names.add("John");
        names.add("Duck");
        names.add("Shinchan");
        System.out.println(names.toString());

        //Delete:
        names.remove("John");
        System.out.println(names.toString());

        //Read
        System.out.println("Here are the elements in the set: ");
        for(String name : names) {
            System.out.println(name);
        }

        //Update
        names.remove("Duck");
        names.add("New Duck");
        System.out.println(names.toString());
    }
    
}
