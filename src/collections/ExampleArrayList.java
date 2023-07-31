package src.collections;
import java.util.ArrayList;

public class ExampleArrayList {

    //Create a list of elements, and perform the following operations on it:
    //1. Insert at the given index.
    //2. Update at the given index.
    //3. Delete at the given index.
    //4. Add to the end of the list.
    //5. Add to the start of the list.
    //6. Print all the elements of the list.

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Vijay");
        names.add("Ashish");

        System.out.println(names.toString());

        String vijayName = names.get(1);
        System.out.println(vijayName);

        names.remove(1);
        System.out.println("After removing index 1:");
        System.out.println(names.toString());

        names.add(1, "Vijay");
        System.out.println("After adding index 1:");
        System.out.println(names.toString());
    }


}