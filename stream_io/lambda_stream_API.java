import java.util.ArrayList;
class GenericClass<T extends Number>
{
    void display()
    {
        System.out.println("Hello");
    }
}
class lambda_stream_API {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("green");
        colors.add("Red");
        colors.add("blue");

        ArrayList<String> colors2=colors;
        colors2.stream().filter((val)-> val.startsWith("R")).map((val)->val.toUpperCase()).sorted().forEach((val)->System.out.println(val));

        //generic bounded types
        //Error
        //GenericClass<String> obj1=new GenericClass<>();
        GenericClass<Integer> obj2=new GenericClass<>();
        obj2.display();
    }
}
