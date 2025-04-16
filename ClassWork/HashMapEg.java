
import java.util.HashMap;

public class HashMapEg{
    public static void main(String[] args) {
        // Creating a HashMap to store student names and their ages
        HashMap<String, Integer> studentAges = new HashMap<>();

        // Inserting key-value pairs into the HashMap
        studentAges.put("Swastik", 20);
        studentAges.put("Hanumat", 20);
        studentAges.put("Charlie", 24);
        studentAges.put("David", 23);

        // Displaying the HashMap
        System.out.println("Initial HashMap: " + studentAges);
        System.out.println();
        
        // Accessing a value
        System.out.println("Swastik's Age: " + studentAges.get("Swastik"));
        System.out.println();

        // Deleting an entry
        studentAges.remove("Charlie");
        System.out.println("HashMap after removing Charlie: " + studentAges);
        System.out.println();

        // Checking if a key exists
        if (studentAges.containsKey("Swastik")) {
            System.out.println("Swastik is in the HashMap.");
            System.out.println();
        }

        // Iterating through the HashMap
        System.out.println("Final HashMap:");
        for (String name : studentAges.keySet()) {
            System.out.println(name + " -> " + studentAges.get(name));
        }
    }
}
