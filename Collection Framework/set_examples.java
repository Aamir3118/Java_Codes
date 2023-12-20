import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;

public class set_examples {
    public static void main(String[] args) {
        Set<String> animals = new HashSet<>();
        animals.add("Horse");
        animals.add("Cow");
        animals.add("Horse");

        System.out.println(animals);

        Set<Integer> set1 = new HashSet<>();

        // Add elements to the set1
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        // Creating another set using the HashSet class
        Set<Integer> set2 = new HashSet<>();

        // Add elements
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: " + set2);

        // Union of two sets
        set2.addAll(set1);
        System.out.println("Union is: " + set2);

        //Hash Set
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("HashSet: " + numbers);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        set1.addAll(numbers);
        System.out.println("Union: "+set1);

       set2.retainAll(set1);
       System.out.println(set2);

       set1.removeAll(set2);
       System.out.println(set1);

       System.out.println(set2.containsAll(set1));

       //sorted set
       SortedSet<Integer> numbers2 = new TreeSet<>();

        // Insert elements to the set
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        System.out.println("SortedSet: " + numbers2);

        // Access the element
        int firstNumber = numbers2.first();
        System.out.println("First Number: " + firstNumber);

        int lastNumber = numbers2.last();
        System.out.println("Last Number: " + lastNumber);

        // Remove elements
        boolean result = numbers2.remove(2);
        System.out.println("Is the number 2 removed? " + result);

        NavigableSet<Integer> numbers3 = new TreeSet<>();

        // Insert elements to the set
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(3);

        
        System.out.println(numbers3.descendingSet());
    }
}
