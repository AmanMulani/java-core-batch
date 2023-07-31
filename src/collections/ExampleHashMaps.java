package src.collections;
import java.util.HashMap;
import java.util.Map;

public class ExampleHashMaps {
    
    public static void main(String[] args) {

        Map<String, String> firstAndLastNames = new HashMap<>();
        
        firstAndLastNames.put("Toy", "Shoy");
        firstAndLastNames.put("Hit", "Tailor");

        //Loop through the Map.
        for(Map.Entry<String, String> name : firstAndLastNames.entrySet()) {
            System.out.println("Key is: " + name.getKey() + ", and value is: " + name.getValue());
        }

        //Read values in map:
        System.out.println(firstAndLastNames.get("Toy"));

        //Update or Replace values:
        firstAndLastNames.replace("Toy", "Noise");
        System.out.println(firstAndLastNames.get("Toy"));

        //Delete keys:
        firstAndLastNames.remove("Toy");
        System.out.println(firstAndLastNames.toString());


        //Check if there exists a value in Map or not for the given key.
        System.out.println(firstAndLastNames.containsKey("Hit"));
        System.out.println(firstAndLastNames.containsKey("Toy"));
        
    }
}
