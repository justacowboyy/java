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





and




    
import java.util.HashMap;
import java.util.Map;

public class HashMapFunctions {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> hashMap = new HashMap<>();

        // Insert key-value pairs
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Checking if a value exists
        boolean containsValue = hashMap.containsValue("Two");
        System.out.println("Contains 'Two': " + containsValue); // Output: true

        // Getting the set of key-value pairs
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Getting keys as a set
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key);
        }

        // Getting values as a collection
        for (String value : hashMap.values()) {
            System.out.println("Value: " + value);
        }

        // Replace the value associated with a key
        hashMap.replace(2, "NewTwo");
        System.out.println("Updated value for key 2: " + hashMap.get(2)); // Output: NewTwo

        // Compute a value based on the key (if absent)
        hashMap.computeIfAbsent(4, key -> "Four");
        System.out.println("Value for key 4: " + hashMap.get(4)); // Output: Four

        // Merge values for a given key
        hashMap.merge(3, "Three", (existingValue, newValue) -> existingValue + newValue);
        System.out.println("Merged value for key 3: " + hashMap.get(3)); // Output: ThreeThree

        // Convert the hashmap to a string
        String hashMapToString = hashMap.toString();
        System.out.println("HashMap as a string: " + hashMapToString);

        // Copy the content of one hashmap to another
        Map<Integer, String> copyHashMap = new HashMap<>(hashMap);

        // Check for equality with another hashmap
        boolean areEqual = hashMap.equals(copyHashMap);
        System.out.println("Are hashmaps equal? " + areEqual); // Output: true
    }
}
