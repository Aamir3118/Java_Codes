import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
class QueueExample
{
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new ArrayDeque<>();
        Queue<String> q3 = new PriorityQueue<>();

        //LinkedList
        q1.add("a");
        q1.offer("b");
        q1.offer("c");
        q1.offer("d");

        System.out.println(q1);

        System.out.println(q1.peek());
        System.out.println(q1.poll());

        System.out.println(q1);

        //Priority queue 
        q2.add("x");
        q2.offer("y");
        q2.offer("z");

        System.out.println(q2);

        System.out.println(q2.peek());
        System.out.println(q2.poll());

        System.out.println(q2);

        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();

        p1.add(1);
        p1.add(2);
        p1.offer(3);
        System.out.println("PriorityQueue: " + p1);

        // Using the offer() method
        p1.offer(1);
        System.out.println("Updated PriorityQueue: " + p1);
    
        System.out.println(p1.remove(1));
        System.out.println(p1);

        Iterator<Integer> iterate = p1.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next()+",");
        }
        p2.add(4);
        p2.add(6);
        p2.add(2);
        System.out.println(p2);

        //Dequeue
        Deque<Integer> numbers = new ArrayDeque<>();

        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        numbers.offer(4);
        numbers.offerLast(5);
        numbers.offerFirst(6);
        System.out.println("Deque: " + numbers);

        System.out.println(numbers.peek());
        System.out.println(numbers.peekFirst());
        System.out.println(numbers.peekLast());

        numbers.poll();
        numbers.pollFirst();
        numbers.pollLast();

        System.out.println("Updated Deque "+numbers);
    
        //Linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);

        linkedList.add(1, 15);

        System.out.println("get: "+linkedList.get(0));
        linkedList.set(0, 14);

        linkedList.remove(1);
        System.out.println(linkedList);

        //LL with Deque
        Deque<String> animals = new LinkedList<>();
        animals.add("Horse");
        System.out.println("LinkedList: " + animals);

        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animals);

        // add elements at the end
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);

        // remove the first element
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals);

        // remove the last element
        animals.removeLast();
        System.out.println("LinkedList after removeLast(): " + animals);
        
        //itearting 
        animals.add("Zebra");
        for (String v : animals) {
            System.out.println(v);
        }

        //ArrayDeque
        ArrayDeque<Integer> age = new ArrayDeque<>();
        age.add(17);
        age.addFirst(19);
        age.addLast(23);
        age.add(22);
        age.offerFirst(29);

        //getfirst
        System.out.println(age.getFirst());

        //getlast
        System.out.println(age.getLast());

        //poll
        age.pollFirst();
        //peek
        System.out.println(age.peekLast());
        System.out.println(age);

        //Blocking queues
        BlockingQueue<String> animal1 = new ArrayBlockingQueue<>(5);
        try {
            animal1.put("Horse");
            animal1.offer("Cow");

            String remEle=animal1.take();
            System.out.println(remEle);
            System.out.println(animal1);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        //Linked blocking queue
        LinkedBlockingQueue<Integer> age2 = new LinkedBlockingQueue<>(5);
        age2.add(18);
        age2.offer(25);
        age2.poll();
        System.out.println(age2);
    }
}

class ComparatorClass implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) {
        int value =  o1.compareTo(o2);
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}