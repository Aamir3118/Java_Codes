class Car
{
    String model;
    String type;
    String name;
    Car(String model)
    {
        this.model=model;
    }
    Car(String type,String name)
    {
        this.type=type;
        this.name=name;
    }
    private String getCarName()
    {
        return this.name;
    }

    //inner
    class Engine
    {
        String engineType;
        void setEngine()
        {
            if(Car.this.type.equals("Abc"))
            {
                if(Car.this.getCarName().equals("80f"))
                {
                    this.engineType="small";
                }
                else
                {
                    this.engineType="big";
                }
            }
            else{
                this.engineType="Not match";
            }
        }
            String getType()
            {
                return this.engineType;
            }
    }

    static class StaticClass
    {
        String nm="abc";
        String getData()
        {
            return nm;
        }
    }

}
public class nested_class2 {
    public static void main(String[] args) {
        Car c1= new Car("Abc", "80f");
        Car.Engine engine= c1.new Engine();

        Car c2= new Car("ABC", "80f");
        Car.Engine engine2= c2.new Engine();
        engine.setEngine();
        System.out.println(engine.getType());

        //Car c3= new Car();
        Car.StaticClass sc=new Car.StaticClass();
        System.out.println(sc.getData());
    }
}
