interface Inneranonymous 
{
    public void display();
}
class A
{
    public void display() {
      System.out.println("A");
   }
}
class AnonClass
{
    void createClass()
    {
        A a=new A()
        {
            public void display()
            {
                System.out.println("anon");
            }
        };
        A a2=new A()
        {
            public void display()
            {
                System.out.println("interface Anon");
            }
        };
        a2.display();
        a.display();
    }
}
public class anonymous {
    public static void main(String[] args) {
        AnonClass anonClass=new AnonClass();
        anonClass.createClass();   
    }
}
