class Vehicle
{
    String type;
    class Bike
    {
        public String geBikeName()
        {
            return "FZ";
        }
    }
    protected class Car
    {
        public String getCarName()
        {
            return "Kia";
        }
    }
}
public class nested_class {
    public static void main(String[] args) {
        Vehicle v1= new Vehicle();
        Vehicle.Bike b1=v1.new Bike();
        Vehicle.Car c1=v1.new Car();
        System.out.println(c1.getCarName());
        System.out.println(b1.geBikeName());
    }
}
