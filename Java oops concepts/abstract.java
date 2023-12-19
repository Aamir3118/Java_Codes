interface Interface1
{
    default void defMeth()
    {
        System.out.println("Default method");
    }
    public void method1();
    //public void method2();
}
interface Interface2
{
    public void method2();
}

abstract class C1
{
    C1()
    {
        System.out.println("Hello from Parent Constructor");
    }
    abstract void display();
    void regMethod()
    {
        System.out.println("Hello");
    }
}
class Test extends C1
{
    Test()
    {
        super();
    }
    void display()
    {
        System.out.println("Hello display");
    }
}
class Test2 implements Interface1,Interface2
{
    public void method1()
    {
        System.out.println("Method1");   
    }
    public void method2()
    {
        System.out.println("Method2");   
    }
    private int age;
    public int getAge() {
        return age;
    }

    // setter method
    public void setAge(int age) {
        this.age = age;
    }
}
class Abstract
{
    public static void main(String args[])
    {
        Test t= new Test();
        t.display();
        Test2 t2=new Test2();
        t2.method1();
        t2.method2();
        t2.defMeth();

        t2.setAge(22);
        System.out.println(t2.getAge());
    }
}