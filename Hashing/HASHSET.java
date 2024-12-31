import java.util.*;

public class HASHSET {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");

        // Display the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element exists
        if (set.contains("Element1")) {
            System.out.println("Element1 is present in the HashSet.");
        }

        // Remove an element
        set.remove("Element2");
        System.out.println("HashSet after removal: " + set);

        // Iterate through the HashSet
        for (String element : set) {
            System.out.println("Iterating element: " + element);
        }
        // Get the hash code of the HashSet
        int hashCode = set.hashCode();
        System.out.println("HashSet hash code: " + hashCode);
        
        // Get an iterator for the HashSet
        Iterator<String> iterator = set.iterator();
        System.out.println("Iterating using iterator:");
        while (iterator.hasNext()) {
            System.out.println("Iterator element: " + iterator.next());
        }
    }
}