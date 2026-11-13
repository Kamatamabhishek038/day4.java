import java.util.LinkedList;

class LinkedListExample1 {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> songs = new LinkedList<>();

        songs.add("Nijame ne chebutunna");
        songs.add("Andhaala Nadhive");
        songs.add("Kissik");
        songs.add("varaniki vaii na kosam daie");

        // Displaying the initial list
        System.out.println("Initial LinkedList: " + songs);

        // Accessing an element
        System.out.println("First Element: " + songs.get(0));

        // Updating an element at index 1
        songs.set(1, "Nijame ne chebutunna");

        // Removing an element (fixed spelling to match the added item)
        songs.remove("varaniki vaii na kosam daie");

        // Updating index 1 again
        songs.set(1, "blackberry");

        // Adding elements at the first and last positions
        songs.addFirst("Baby doll");
        songs.addLast("aa ante amalapuram");

        // Displaying the final list and size
        System.out.println("Updated LinkedList: " + songs);
        System.out.println("Size: " + songs.size());
    }
}
