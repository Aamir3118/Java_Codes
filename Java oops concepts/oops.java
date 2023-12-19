class Stud1
{
    private String data;
    String name="Aamir";
    int rollNo=5;
    final int age=18;

    //error
    //age=19;

    public String getName() {
        return this.data;
    }
    // setter method
    public void setName(String data) {
        this.data=data;
    }
    void display()
    {
        System.out.println("Name: "+name+", Roll No: "+rollNo);
    }
}
class AddNum
{
    int n1;
    int n2;

    public int add()
    {
        return n1+n2;
    }
    public int squareNum(int sqNo)
    {
        return sqNo*sqNo;
    }
    public void displayWithoutParam()
    {
        System.out.println("No Param");
    }

    public void displayWithParam(String n)
    {
        System.out.println("Hello, "+n);
    }

    public void overloadMeth1(int a,float b)
    {
        System.out.println("sum: "+(a+b));
    }

    public float overloadMeth1(int a,float b,int c)
    {
        return (a+b+c);
    }
}

class Oops
{
    public static void main(String args[])
    {
        Stud1 s=new Stud1();
        s.display();
        System.out.println(s.name);

        System.out.println("--------");
        AddNum add1=new AddNum();
        add1.n1=4;
        add1.n2=4;
        int res=add1.add();
        int square=add1.squareNum(5);
        System.out.println("Square is: "+square);
        System.out.println("Addition is: "+res);

        // With and without parameters
        add1.displayWithoutParam();
        add1.displayWithParam("Aamir");

        //method overloading
        add1.overloadMeth1(1,2.5f);
        System.out.println("sum: "+add1.overloadMeth1(1,2.5f,5));

        //s.data="Aamir"; //Error

        s.setName("aamir");
        System.out.println(s.getName());
    }
}