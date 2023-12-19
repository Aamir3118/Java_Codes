import java.util.Arrays;
class JavaStrings
{
    public static void main(String args[])
    {
       String s1="Hello world";
       String s2="Hello World ";
       String s3="Hello world Hello world hi help";
       System.out.println(s1);
       System.out.println("Length: "+s1.length());

       //concat
       String concatStr=s1.concat(" hi");
       System.out.println(concatStr);

       //compare
       System.out.println(s1.equals(s3));
       System.out.println(s1.equals(s2));
       System.out.println("Hello \"Aamir\"");

       //checking immutable
       s3.concat(" Hello");
       System.out.println(s3);
       
       //contains
       System.out.println(s3.contains("Hello"));

       if(s3.contains("Hello"))
       {
            System.out.println("Contains");
       }

       //substring
       System.out.println(s3.substring(0,4));
       System.out.println(s3.substring(2));

       //join
       String newStr=String.join("-",s3,"help");
       System.out.println(newStr);

       //replace
       System.out.println(s3.replace('H','f'));
       System.out.println(s3.replace('h','f'));

       //replace all
       String str1="aaHHElooWoH0";
       System.out.println(str1.replaceAll("H","hi"));
    
        //replace first
        System.out.println(str1.replaceFirst("H","hi"));

        //charAt
        System.out.println(s3.charAt(4));
        //System.out.println(s3.charAt(22)); //Error
        
        //getBytes
        byte[] arr1;
        String newStr1="HiHelp";
        String newStr2="Hi Help";
        String newStr3="hi";
        arr1=newStr2.getBytes();
        System.out.println(Arrays.toString(arr1));
    
        //indexOf
        System.out.println(newStr2.indexOf('H',1));
        System.out.println(newStr2.indexOf('H'));
        System.out.println(newStr2.indexOf('a'));

        //CompareTo
        System.out.println(newStr1.compareTo(newStr3));
        System.out.println(newStr2.compareTo(newStr3));
        System.out.println(newStr3.compareTo(newStr1));

        //Trim
        String newStr4="  hi  ";
        System.out.println(newStr4);
        System.out.println(newStr4.trim());

        //format
        String result = String.format("Hello: %s", newStr3);
        System.out.println(result);
        int n1 = 4;
        float n2 = 3.8f;
        double n3 = 6575.76d;

    // format as an octal number
        System.out.println(String.format("n1 in octal: %o", n1));


        // format as hexadecimal numbers
        System.out.println(String.format("n1 in hexadecimal: %x", n1));  
        System.out.println(String.format("n1 in hexadecimal: %X", n1)); 

        // format as strings
        System.out.println(String.format("n1 as string: %s", n1));  
        System.out.println(String.format("n2 as string: %s", n2));
    
        //split
        String[] result2 = s1.split(" ");
        for (String s:result2)
        {
            System.out.print(s);
        }
        System.out.println();

        String[] result3 = s3.split(" ",2);
        for (String s:result3)
        {
            System.out.print(s);
        }
                    System.out.println();
        System.out.print(Arrays.toString(result3));

        //upper lower
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());

        //starts and ends with
        System.out.println(s3.startsWith("H"));
        System.out.println(s3.startsWith("h"));
        System.out.println(s3.endsWith("p"));
        System.out.println(s3.endsWith("h"));
    }
}