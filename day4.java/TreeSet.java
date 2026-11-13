import java.util.TreeSet;

class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        
        // Adding an element//
        names.add("John");
        names.add("Alice");
        names.add("David");
        names.add("Robert");

        // Adding duplicate Elements //
        names.add("john");

        // Displaying the set//
        System.out.println("TreeSet:" + names);

        // Accessing an element//
        System.out.println("TreeSet:" + names);

        // removing an element //
        names.remove("David");

        // Checking an element //
        System.out.println("contains Alice:" + names.contains("Alice"));

        //size of Treeset //
        System.out.println("size:" + names.size());

        // check if set is empty //
        System.out.println("Is Empty:" + names.isEmpty());
    }
}
