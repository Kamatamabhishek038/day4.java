import java.util.HashSet;

class HashSetExample {
    public static void main(String[] args) {
        // Fixed variable name: removed the space
        HashSet<String> employeeId = new HashSet<>();
        
        // Adding elements
        employeeId.add("101");
        employeeId.add("102");
        employeeId.add("103");
        employeeId.add("104");
        employeeId.add("105");
        employeeId.add("106");
        employeeId.add("107");
        employeeId.add("108");
        employeeId.add("109");
        employeeId.add("110");

        // Adding duplicate element (will be ignored by HashSet)
        employeeId.add("102");

        // Displaying the set
        System.out.println("HashSet: " + employeeId);

        // Iterating through elements (HashSet has no .get(index) method)
        System.out.print("Accessing elements: ");
        for (String id : employeeId) {
            System.out.print(id + " ");
        }
        System.out.println();

        // Removing an element
        employeeId.remove("103");

        // Checking for an element
        System.out.println("Contains 105: " + employeeId.contains("105"));

        // Size of HashSet
        System.out.println("Size: " + employeeId.size());

        // Check if set is empty
        System.out.println("Is Empty: " + employeeId.isEmpty());
    }
}
