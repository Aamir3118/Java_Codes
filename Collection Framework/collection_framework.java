import java.util.*;
public class collection_framework {
    public static void main(String[] args) {
        List<String> arrayList= new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("hi");
        arrayList.add("help");
        arrayList.add("hey");

        for (String ele : arrayList) {
            System.out.print(ele+" ");
        }
        System.out.println();

        System.out.println(arrayList.toString());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList.toString());

        //Array List
        ArrayList<Integer> arrayList2= new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);

        for (int ele : arrayList2) {
            System.out.print(ele+" ");
        }
        System.out.println();

        System.out.println(arrayList2.remove(2));
        System.out.println(arrayList2.size());
        arrayList2.add(0, 10);
        System.out.println(arrayList2.toString());
        arrayList2.set(1, 11);
        System.out.println(arrayList2.toString());

        //sort
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList.toString());
        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList.toString());
        System.out.println(arrayList.contains("hey"));
        System.out.println(arrayList.indexOf("hey"));

        //iterating
        for (Integer i : arrayList2) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Vector
        Vector<String> vector=new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        Vector<String> vector2=new Vector<>();
        vector2.add("d");

        vector2.addAll(vector);

        System.out.println(vector.toString());
        System.out.println(vector2.toString());
        System.out.println(vector.get(0));

        //iterator
        Iterator<Integer> iterator=arrayList2.iterator();
        while (iterator.hasNext()) {
            System.err.println(iterator.next());
        }

        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(101);
        stack.push(102);
        stack.push(103);
        stack.push(104);

        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        System.out.println(stack.peek());
        System.out.println(stack.search(106));
    }   
}
