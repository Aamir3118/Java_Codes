import java.util.logging.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ExceptionExample
{
    static void divideZero()
    {
        throw new ArithmeticException("Cannot divide by 0");
    }
    static void indexOutOfBound() throws ArrayIndexOutOfBoundsException
    {   
        int a[]={1,2,3,4,5};
        System.out.println(a[5]);
    }
}
public class exception {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //assertion
        String weekDays[]={"Sumday","Monday","Tuesday"};
        assert weekDays.length == 2;
        System.out.println("Correct: "+weekDays.length);
        try {
            int ans=5/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("I always executes");
        }
        System.out.println("Hello");
        
        ExceptionExample.divideZero();

        try {
            ExceptionExample.indexOutOfBound();
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //try-with-resources
        //BufferedReader br = null;
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
      while ((line = br.readLine()) != null) {
        System.out.println("Line =>"+line);
        }
        } catch (IOException e) {
        System.out.println("IOException in try block =>" + e.getMessage());
        }

    }
}
