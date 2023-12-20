import java.util.ArrayList;
import java.util.*;
public class max_from_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        int data;
        int array[]=new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i <size; i++) {
            data=sc.nextInt();
            array[i]=data;
        }
        int max=array[0];
        for (int j = 0; j < size; j++) {
                if (array[j]>max) {
                    max=array[j];
                }
        }

        System.out.println("Max is: "+max);
        
    }
}
