import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class map_examples {
   public static void main(String[] args) 
   {
        // Map implementation using HashMap
        Map<Integer,String> map1=new HashMap<>();

        //put
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");

        Map<Integer,String> map2=new HashMap<>();
        map2.put(5, "Five");

        //put all
        map1.putAll(map2);

        System.out.println(map1);
        System.out.println(map2);

        //get
        System.out.println(map1.get(1));

        //get or default
        System.out.println(map1.getOrDefault(6, "Six"));

        //contains key value
        System.out.println(map1.containsKey(2));
        System.out.println(map1.containsValue("Seven"));

        //replace
        map1.replace(1, "1");
        map1.replace(2, "two", "TWO");

        //remove
        map1.remove(1);
        map1.remove(2, "two"); // Not removed bcoz not found the value
        System.out.println(map1);

        //keyset and values
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        //entryset
        System.out.println(map1.entrySet());

        //HASH MAP
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("hello", 1);
        hm1.put("hi", 2);
        hm1.put("hey", 4);
        hm1.put("help", 3);

        System.out.println(hm1);

        hm1.replace("hello", 8);
        hm1.remove("help");

        //merge
        hm1.merge("hello world", 2, (oldV,newV)->oldV+newV);

        //with duplicate key
        hm1.merge("hello", 4, (oldV,newV)->(oldV+newV));

        System.out.println(hm1);
        //compute
        hm1.compute("hi",(k,v)->(v+10));
        hm1.computeIfAbsent("heyyy", (k)->25);
        hm1.computeIfPresent("heyyy", (k,v)->(v+v*5));

        System.out.println(hm1);

        //Treemap
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("two", 2);
        evenNumbers.put("three", 3);
        evenNumbers.put("Four", 4);

        System.out.println(evenNumbers);
        System.out.println(evenNumbers.keySet());
        System.out.println(evenNumbers.entrySet());

        evenNumbers.replace("two", 22);
        System.out.println(evenNumbers);

        //get first and last key
        System.out.println(evenNumbers.firstKey());
        System.out.println(evenNumbers.lastKey());
        
        //concurrent map
        ConcurrentMap<String, Integer> numbers = new ConcurrentHashMap<>(evenNumbers);
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Three", 3);
        System.out.println("ConcurrentMap: " + numbers);

        ConcurrentHashMap<String, Integer> numbers2 = new ConcurrentHashMap<>();
        numbers2.put("One", 1);
        numbers2.put("Two", 2);
        numbers2.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers2);

        // Using search()
        int sum = numbers2.reduce(4, (k, v) -> v, (v1, v2) -> v1 + v2);
        System.out.println("Sum of all values: " + sum);
        
    } 
}
