import java.util.*;
class Task6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter your Roll No: ");
        int rollno=sc.nextInt();
        System.out.println("Enter your Percentage: ");
        double per=sc.nextDouble();
        System.out.println("Enter your Address: ");
        String address=sc.next();

        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("PErcentage: "+per);
        System.out.println("Address: "+address);

        System.out.println("Type Casting");
        int a=10;
        double d=a;
        long l=a;
        System.out.println("a: "+a);
        System.out.println("d: "+d);
        System.out.println("l: "+l);

        double data1=10.66;
        int dataInt=(int)data1;
        System.out.println("dataInt "+dataInt);
        String strConvert=String.valueOf(dataInt);
        System.out.println("str: "+strConvert);
        System.out.println("Int: "+Integer.parseInt(strConvert));
    }
}