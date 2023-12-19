import java.io.FileNotFoundException;

public class exception_throws {

    static void indexOutOfBound() throws ArithmeticException,FileNotFoundException,ArrayIndexOutOfBoundsException
    {   
        int a[]={1,2,3,4,5};
        System.out.println(a[5]);
    }
    public static void main(String[] args) 
    {
        try {
            indexOutOfBound();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            int a2[]={1,2,3,4,5};
            a2[5]=6;
        } catch (NumberFormatException e1) {
            System.out.println(e1);

        }
        catch(IndexOutOfBoundsException e2)
        {
            System.out.println(e2);

        }
        catch(ArithmeticException e3)
        {
            System.out.println(e3);

        }
    }
}
