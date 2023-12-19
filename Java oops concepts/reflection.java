import java.lang.Class;
import java.lang.reflect.*;

class A {

    public A()
{

}
private A(int age)
{
    
}

  // methods of the class
  public void display() {
    System.out.println("A");
  }

//   private void makeSound() {
//     System.out.println("");
//   }
}

class Reflection {
  public static void main(String[] args) {
    try {

      A d1 = new A();

      Class obj = d1.getClass();

      Method[] methods = obj.getDeclaredMethods();

      for (Method m : methods) {

        System.out.println("Method Name: " + m.getName());
        int modifier = m.getModifiers();
        System.out.println("Modifier: " + Modifier.toString(modifier));
        System.out.println("Return Types: " + m.getReturnType());
        System.out.println(" ");
      }

      A a1= new A();
      Class obj2=a1.getClass();

      Constructor[]  constructors=obj2.getDeclaredConstructors();
      for(Constructor c:constructors)
      {
        
      int mod2=obj2.getModifiers();
      String modstr=Modifier.toString(mod2);
      System.out.println("Modifier: " + modstr);
      System.out.println("Name: "+obj2.getName());

      System.out.println(c.getParameterCount());
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}