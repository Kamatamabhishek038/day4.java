import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

class HashSetExample {
    public static void main(String[] args) {
        // Changed to Integer so numbers sort numerically (e.g., 95 before 100)
        HashSet<Integer> marks = new HashSet<>();
        
        // Adding elements
        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);
        marks.add(95);
        marks.add(75); // Duplicate ignored
        marks.add(80);

        // 1. Sorting in ascending order using TreeSet
        TreeSet<Integer> ascendingMarks = new TreeSet<>(marks);
        System.out.println("Ascending HashSet: " + ascendingMarks);

        // 2. Sorting in descending order using TreeSet
        TreeSet<Integer> descendingMarks = new TreeSet<>(Collections.reverseOrder());
        descendingMarks.addAll(marks);
        System.out.println("Descending HashSet: " + descendingMarks);

        // Displaying the original HashSet
        System.out.println("HashSet: " + marks);

        // Removing an element
        marks.remove(65);

        // Checking an element
        System.out.println("Contains 90: " + marks.contains(90));

        // Displaying unique marks (after removing 65)
        System.out.println("Unique marks: " + marks);
    }
}
