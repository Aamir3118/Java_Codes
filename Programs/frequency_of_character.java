import java.util.HashMap;

public class frequency_of_character {
    public static void main(String[] args) {
        //7. Java Program to Find the Frequency of Character in a String
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        String s="aabbbcdfaafg";
        char c[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }
            else {
                hm.put(s.charAt(i), 1);
            }
        }

        System.out.println(hm);

        //8. Java Program to Remove All Whitespaces from a String
        String str1="  Hello World   ";
        System.out.println("Before change: "+ str1);
        String newStr=str1.trim();
        System.out.println("After changing: "+ newStr);
    }
}
