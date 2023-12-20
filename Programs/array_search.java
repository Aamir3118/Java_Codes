import java.util.*;
public class array_search {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to search");
        int search = scanner.nextInt();
        boolean found=false;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==search)
            {
                found=true;
                break;
            }
            else
            {
                found=false;
            }
        }
        if (found) {
            System.out.println("Found");
        }
        else{
            System.out.println("not found");
        }
    }
}

