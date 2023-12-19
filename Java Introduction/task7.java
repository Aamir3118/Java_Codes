import java.util.*;
class Task7
{
    public static void main(String args[])
    {
        //1. Java Program to Find ASCII Value of a character
        Scanner sc= new Scanner(System.in);
        char c1='a';
        char c2='b';
        char c3='A';
        char c4='B';

        System.out.println("a: "+(int)c1);
        System.out.println("b: "+(int)c2);
        System.out.println("A: "+(int)c3);
        System.out.println("B: "+(int)c4);

        //2. Java Program to Swap Two Numbers (Using 3 variables/using 2 variables)

        //using third variable
        int num1=2;
        int num2=4;
        int temp;

        System.out.println("before: ");
        System.out.println("num1: "+num1+",num2: "+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after: ");
        System.out.println("num1: "+num1+",num2: "+num2);

        //without third variable
        int n1=3;
        int n2=7;

        System.out.println("before: ");
        System.out.println("n1: "+n1+",n2: "+n2);
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("after: ");
        System.out.println("n1: "+n1+",n2: "+n2);

        // 3. Java Program to Find Factorial of a Number
        int fact=1;
        System.out.println("Enter a number for finding factorial: ");
        int number=sc.nextInt();
        for (int i=1;i<=number;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

        // 4. Java Program to Generate Multiplication Table (user will enter number, end number of table)
        System.out.println("Enter a number for multiplication table: ");
        int multiNum=sc.nextInt();
        for(int j=1;j<=10;j++)
        {
            System.out.println(multiNum+"x"+j+"="+multiNum*j);
        }

        // 5. Java Program to Reverse a Number
        int rem,rev=0,dummy;
        int orgNo=65;
        dummy=orgNo;
        while(orgNo!=0)
        {
            rem=orgNo%10;
            rev=(rev*10)+rem;
            orgNo/=10;
        }
        System.out.println("Reverse of "+dummy+" is: "+rev);

        // 6. Java Program to Check Palindrome
        int rem2,rev2=0,dummy2;
        int orgNo2=121;
        dummy2=orgNo2;
        while(orgNo2!=0)
        {
            rem2=orgNo2%10;
            rev2=(rev2*10)+rem2;
            orgNo2/=10;
        }
        if(dummy2 == rev2)
        {
            System.out.println("Palindrome: "+rev2);
        }
        else
        {
            System.out.println("Not Palindrome: "+rev2);
        }

        // 7. Java Program to Check Armstrong Number
        int rem3,rev3=0,dummy3;
        int sum=0;
        System.out.println("Enter number to find armstrong or not");
        int orgNo3=sc.nextInt();
        dummy3=orgNo3;
        while(orgNo3!=0)
        {
            rem3=orgNo3%10;
            sum+=(rem3*rem3*rem3);
            rev3=(rev3*10)+rem3;
            orgNo3/=10;
        }
        if(dummy3 == sum)
        {
            System.out.println("Armstrong: "+sum);
        }
        else
        {
            System.out.println("Not Armstrong: "+sum);
        }

        // 8. Java Program to Display Factors of a Number
        System.out.println("Enter a number for finding factors: ");
        int factNo=sc.nextInt();
        System.out.println("Factors of number "+factNo);
        for (int z=1;z<=factNo;z++)
        {
            if(factNo%z == 0)
            {
                System.out.println(z);
            }
        }
    }
}