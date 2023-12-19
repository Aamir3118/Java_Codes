import javax.print.attribute.standard.Media;

enum Size
{
    SMALL,LARGE,MEDIUM,
}
enum Size3
{
    SMALL{
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "this is small";
        }
    },
    LARGE{
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "this is large";
        }
    };
}
enum Size2
{
    SMALL("This is Small"),
    LARGE("This is Large"),
    MEDIUM("This is Medium");

    private final String sizePizza;
    private Size2(String sizePizza) {
      this.sizePizza = sizePizza;
   }

   public String getSize() {
      return sizePizza;
   }

}
class Database {
   private static Database dbObject;

   private Database() {      
   }

   public static Database getInstance() {

      if(dbObject == null) {
         dbObject = new Database();
      }

       // returns the singleton object
       return dbObject;
   }

   public void getConnection() {
       System.out.println("connected to the database.");
   }

}

class Testing
{
    Size size;
    Testing(Size size)
    {
        this.size=size;
    }

    void orderPizza()
    {
        switch (size) {
            case SMALL:
                System.out.println("small pizza");
                break;
            case LARGE:
                System.out.println("Large pizza");    
                break;
            case MEDIUM:
                System.out.println("Medium pizza");
                break;
            default:
                break;
        }
    }
}
public class singleton {
    public static void main(String[] args) {
        Database db1;
        db1=Database.getInstance();
        db1.getConnection();

        System.out.println(Size.LARGE);

        Testing t1= new Testing(Size.LARGE);
        t1.orderPizza();
        System.out.println(Size.LARGE.ordinal());
        System.out.println(Size.LARGE.compareTo(Size.MEDIUM));
        System.out.println(Size.LARGE.equals("MEDIUM"));
        System.out.println(Size.LARGE.name());

        Size2 s =Size2.MEDIUM;
        System.out.println(s.getSize());

        System.out.println("value is: "+Size.LARGE.toString());
        System.out.println("value is: "+Size3.LARGE.toString());
    }
}
