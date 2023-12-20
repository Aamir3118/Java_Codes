import java.util.*;
class Custom_Exception2 extends Exception
{
   public Custom_Exception2(String msg) {
       super(msg);
   }
}

public class custom_exception {
    public static void main(String[] args) throws Custom_Exception2{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number (Not greater than 10)");
        int num=scanner.nextInt();
        if (num > 10) {
            throw new Custom_Exception2("Not be greater than 10");
        }
        else
        {
            System.out.println("number: "+num);
        }
    }
}
