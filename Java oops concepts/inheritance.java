class A
{
    A(String type)
    {
        System.out.println("A constructor "+type);
    }

    protected String nm;
    protected String nm2="Aamir";
    void display()
    {
        System.out.println("Hello from A");
    }
    void sameMeth()
    {
        System.out.println("Hello i am A");
    }
    protected void displayData()
    {
        System.out.println("A");
    }
}
class B extends A
{
    B()
    {
        super("Parent");
        System.out.println("B constructor");
    }
    public String nm2="Balawala";
    void display2()
    {
        System.out.println("Hello from B");
    }
    void sameMeth()
    {
        System.out.println("Hello i am B");
        super.sameMeth();
    }
    void getName()
    {
        System.out.println("Hello: "+nm);
    }
    public void displayData()
    {
        System.out.println("B");
        super.displayData();
    }
    public void printNames()
    {
        System.out.println("From B class "+this.nm2);
        System.out.println("From A class "+super.nm2);
    }
}
class C extends B
{
    void display3()
    {
        System.out.println("Hello from C");
    }
    void sameMeth()
    {
        System.out.println("Hello i am C");
        super.sameMeth();
    }
}
class Inheritance
{
    public static void main(String args[])
    {
        B b1=new B();
        C c1=new C();
        b1.display();
        b1.display2();
        c1.display3();
        b1.sameMeth();
        System.out.println("-------");
        c1.sameMeth();
        b1.nm="Aamir";
        b1.getName();
        b1.displayData();

        System.out.println("-------");
        b1.printNames();
        System.out.println("-------");
        B b2=new B();
    }
}