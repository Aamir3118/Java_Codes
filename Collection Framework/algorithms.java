import java.util.ArrayList;
import java.util.Collections;

public class algorithms {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // Using the sort() method
        Collections.sort(numbers);
        System.out.println(numbers);

        //shuffle
        Collections.shuffle(numbers);
        System.out.println(numbers);

        //reverse
        Collections.reverse(numbers);
        System.out.println(numbers);

        //swap
        Collections.swap(numbers,0,2);
        System.out.println(numbers);

        //binary serach
        System.out.println(Collections.binarySearch(numbers,2));
        System.out.println(Collections.frequency(numbers,2));

        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));

    }
}
