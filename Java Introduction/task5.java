import java.util.*;
class Task5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=4;
        switch(a)
        {
            case a<5:
                System.out.println("hello");
                break;
            case a+4<5:
                System.out.println("Hi");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println(a+4<5);
        //for(;;) //Error
        //for(;;){} //No error
        //for(int i=0;i<5;) //Error
        
        //No Error (in loop)
        // for(int j=0;j<5;){
        //     System.out.println(j);
        // }

        // for() //Error
        // for(); //Error


    }
}