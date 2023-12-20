public class wrapper_example {
    public static void main(String[] args) {
        int age=23;
        double perc=85.5;
        
        //Wrapper
        Integer i=Integer.valueOf(age);
        Double d=Double.valueOf(perc);
        System.out.println(i);

        if (i instanceof Integer) {
            System.out.println("True");
        }
        if(d instanceof Double)
        {
            System.out.println("True");
        }

        //Wrapper to primitive
        int newAge=i.intValue();
        double newPerc=d.doubleValue();

        System.out.println(newAge);
    }
}
