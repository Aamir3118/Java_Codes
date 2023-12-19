import java.util.Scanner;
class Task4
{
    public static void main(String args[])
    {
        int ch;
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("1 else-if");
            System.out.println("2 Nested if-else");
            System.out.println("3 for loop");
            System.out.println("4 break and continue");
            System.out.println("Press any number > 4 to exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Enter percentage");
                    int percentage=sc.nextInt();
                    if(percentage >= 90 && percentage <=100)
                    {
                        System.out.println("Outstanding");
                    }
                    else if(percentage >=75 && percentage <=89)
                    {
                        System.out.println("Excellent");
                    }
                    else if(percentage >=34 && percentage <=74)
                    {
                        System.out.println("Good");
                    }
                    else 
                    {
                        System.out.println("Fail");
                    }
                    break;
                case 2:
                    System.out.println("Enter n1: ");
                    int n1=sc.nextInt();
                    System.out.println("Enter n2: ");
                    int n2=sc.nextInt();
                    System.out.println("Enter n3: ");
                    int n3=sc.nextInt();
                    if(n1>n2)
                    {
                        if(n1>n3)
                        {
                            System.out.println("n1 is greater: "+n1);
                        }
                    }
                    else
                    {
                        if(n2>n3)
                        {
                            System.out.println("n2 is greater: "+n2);
                        }
                        else
                        {
                            System.out.println("n3 is greater: "+n3);
                        }
                    }

                    break;
                case 3:
                    int sum=0;
                    //for loop
                    for (int i=1;i<6;i++)
                    {
                        sum+=i;
                    }
                    System.out.println("Sum is: "+sum);

                    //for each loop
                    int i[]={4,5,6,7};
                    for (int val : i)
                    {
                        System.out.println(val);
                    }

                    //with length function
                    char c[]={'a','b','c','d'};
                    for (int j=0;j<c.length;j++)
                    {
                        System.out.println(c[j]);
                    }
                    break;

                case 4:
                    //break
                    System.out.println("break");
                    for(int x=0;x<6;x++)
                    {
                        if(x==3)
                        {
                            break;
                        }
                        System.out.println(x);
                    }
                    //continue
                    System.out.println("Continue");
                    for(int z=0;z<6;z++)
                    {
                        if(z==3)
                        {
                            continue;
                        }
                        System.out.println(z);
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        while(ch<=4);
    }
}