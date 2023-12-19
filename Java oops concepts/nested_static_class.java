class A
{
    class B
    {
        public void displayInfo()
        {
            System.out.println("B");
        }
    }
    static class C
    {
        public void displayInfo()
        {
            System.out.println("C");
        }
    }
}

public class nested_static_class {
    public static void main(String[] args) {
        A a =new A();
        A.B b=a.new B();
        b.displayInfo();

        A.C c= new A.C();
        c.displayInfo();
    }
}
