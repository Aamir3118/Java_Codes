class Test1
{
    int rollNo;
    String name;
    Test1()
    {
        System.out.println("Constructor"); 
    }
    Test1(String nm)
    {
        name=nm;
        System.out.println("Name: "+name);
    }
}
class JavaConstructor
{
    public static void main(String args[])
    {
        Test1 t1=new Test1();
        Test1 t2=new Test1("Aamir");
        System.out.println(t1.rollNo);
        System.out.println(t2.name);
    }
}