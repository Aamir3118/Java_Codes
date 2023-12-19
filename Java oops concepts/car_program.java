
abstract class Engine
{
    boolean engine;
    void setOnOff(boolean engine)
    {
        this.engine=engine;
    }
    abstract public void setPrice(long price);
}

class Car1 extends Engine
{
    private String brandName;
    private String modelName;
    private int year;
    private long price;

    Car1()
    {

    }

    public void setBrandName(String brandName)
    {
        this.brandName=brandName;
    }
    public String getBrandName()
    {
        return this.brandName;
    }
    public void setModelName(String modelName)
    {
        this.modelName=modelName;
    }
    public String getModelName()
    {
        return this.modelName;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public int getYear()
    {
        return this.year;
    }
    public void setPrice(long price)
    {
        this.price=price;
    }
    public long getPrice()
    {
        return this.price;
    }
}
class Car
{
    public static void main(String args[])
    {
        Car1 car1=new Car1();
        car1.setBrandName("Tata");
        car1.setModelName("Tata Nexon");
        car1.setYear(2017);
        car1.setPrice(250000);
        car1.setOnOff(true);

        System.out.println(car1.getBrandName());
        System.out.println(car1.getYear());
        System.out.println(car1.getModelName());
        if(car1.engine==true)
        {
            System.out.println("Engine is ON");
        }
        else
        {
            System.out.println("Engine is OFF");
        }
    }
}