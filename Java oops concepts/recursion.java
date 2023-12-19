class Square
{

}
class Factorial extends Square
{
    static int factorial( int n ) {
        if (n != 0)  
            return n * factorial(n-1); 
        else
            return 1;
    }

}
class Recursion
{
    public static void main(String args[])
    {
        int num=4;
        System.out.println(num + " factorial = " + Factorial.factorial(num));

        //instance of
        Factorial f=new Factorial();
        String name ="hello";
        boolean res=name instanceof String;
        boolean res2=f instanceof Factorial;
        boolean res3=f instanceof Square;
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}