interface Innerlambda_example {
    String getName(String nm);
}
interface Innerlambda_example2 {
    String reverseName(String nm2);
}
interface GenericInterface<T> {
    T func(T t);
    
}
public class lambda_example {
    public static void main(String[] args) {
        //with single expression
        Innerlambda_example lExample;
        Innerlambda_example2 lExample2;

        //getting name
        lExample=(nm2)->nm2;

        //reverse
        lExample2=(nm)->{
            String res="";
            for(int i=nm.length()-1;i>=0;i--)
            {
                res+=nm.charAt(i);
            }
            return res;
        };
        System.out.println(lExample.getName("Aamir"));
        System.out.println(lExample2.reverseName("Aamir"));

        //Generic interface
        GenericInterface<String> rev =(strNm)->
        {
            String res="";
            for(int i=strNm.length()-1;i>=0;i--)
            {
                res+=strNm.charAt(i);
            }
            return res;
        };
        System.out.println(rev.func("Hello"));

        GenericInterface<Integer> factNo =(no)->
        {
            int fact=1;
            for(int i=1;i<=no;i++)
            {
                fact*=i;
            }
            return fact;
        };
        System.out.println(factNo.func(4));
        System.out.println(factNo.func(6));

    }   
}
