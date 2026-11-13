import java.util.LinkedHashSet;

class LinkedHashSetExample {
    public static void main(String[] args) {
    LinkedHashSet<String> products = new LinkedHashSet<>();
        
        // Adding an element//
        products.add("Laptop");
        products.add("mobile");
        products.add("Headphone");
        products.add("Smart watch");

        // Adding duplicate Elements //
        products.add("Laptop");

        // Adding duplicate Elements //
        products.add("Tablet");


        // Displaying the set//
        System.out.println("LinkedHashSet:" + products);

        // Accessing an element//
        System.out.println("LinkedHashSet:" + products);

        // removing an element //
        products.remove("Headphone");

        // Checking an element //
        System.out.println("contains mobile:" + products.contains("mobile"));

         // Displaying the set//
        System.out.println("LinkedHashSet:" + products);
      
    }
}
