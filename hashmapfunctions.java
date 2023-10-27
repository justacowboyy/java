import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> hashMap = new HashMap<>();

        // Insert key-value pairs
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Access a value by key
        System.out.println(hashMap.get(2)); // Output: Two

        // Check if a key exists
        System.out.println(hashMap.containsKey(4)); // Output: false

        // Remove a key-value pair
        hashMap.remove(1);

        // Iterate over the keys
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Iterate over the values
        for (String value : hashMap.values()) {
            System.out.println("Value: " + value);
        }

        // Size of the HashMap
        System.out.println("Size: " + hashMap.size());

        // Check if the HashMap is empty
        System.out.println("Is empty? " + hashMap.isEmpty());

        // Clear the HashMap
        hashMap.clear();

        // Check if the HashMap is empty after clearing
        System.out.println("Is empty? " + hashMap.isEmpty());
    }
}
