import java.util.Scanner;
class Task3
{
    public static void main(String args[])
    {
        /* 
            hello
            Doing 
            task3
        */
        System.out.println("Hello");
        System.out.println("World");
        System.out.print("Hello");
        System.out.print("World");

        Scanner sc= new Scanner(System.in);
        System.out.println("\n Enter int value");
        int n1=sc.nextInt();// taking user input of type int
        System.out.println("Enter Float value");
        float f1=sc.nextFloat();
        System.out.println("Enter String value");
        String s1=sc.next();
        System.out.println("Enter double value");
        double d1=sc.nextDouble();
        System.out.println("User Input");
        System.out.println(n1);
        System.out.println(f1);
        System.out.println(s1);
        System.out.println(d1);

        System.out.println("Java Expressions, Statements and Blocks");
        int num1=9;
        int num2=7;
        String str1="hi";
        float exp=num1+num2 - 2.4f;
        System.out.println(exp);

        if(n1>num2)
        {
            System.out.println("Num1 is greater: "+num1);
        }
        else
        {
            System.out.println("Num2 is greater"+num2);
        }
        if(s1=="hi")
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not same");
        }
    }
}