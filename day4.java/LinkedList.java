import java.util.LinkedList;

class linkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        
        // creating a linked list//
        names.add("John");
        names.add("Alice");
        names.add("David");
        names.add("Robert");

        // Displaying the list//
        System.out.println("Linkedlist:" + names);

        // Accessing an element//
        System.out.println("FirstElement:" + names.get(0));

        // Updating an element //
        names.set(1, "peter");

        // removing an element //
        names.remove("David");

        // Updating an element //
        names.set(1, "peter");

        // adding element at first position //
        names.addFirst("sam");

        //adding element at last positin //
        names.addLast("Tom");

        //size of linked list //
        System.out.println("size:" + names.size());
    }
}
