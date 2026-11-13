import java.util.LinkedHashMap;

class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap with Integer keys and String values
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        // Adding elements using put(key, value)
        students.put(101, "John");
        students.put(102, "Alice");
        students.put(103, "David");
        students.put(104, "Robert");

        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap: " + students);

        // Accessing an element by its key
        System.out.println("Element at key 101: " + students.get(101));

        // Updating an element using put() or replace()
        students.put(102, "Peter");

        // Removing an element by its key
        students.remove(103);

        // Checking if a key exists (Note the capital 'K')
        System.out.println("Contains key 101: " + students.containsKey(101));

        // Checking if a value exists (Note the capital 'V' and exact string match)
        System.out.println("Contains value John: " + students.containsValue("John"));

        // Size of the LinkedHashMap
        System.out.println("Size: " + students.size());
    }
}