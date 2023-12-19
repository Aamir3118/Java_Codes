import java.util.Arrays;
class Array1
{
    public static void main(String args[])
    {
        int[] arr1;
        arr1=new int[5];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=4;
        arr1[4]=5;

        System.out.println("arr1[1]: "+ arr1[1]);
        System.out.println("last element: "+ arr1[arr1.length-1]);

        int[] arr2={11,12,13,14,15};
        int sum=0;
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
            sum+=arr2[i];
        }

        System.out.println("Sum: "+ sum);
        System.out.println("Avg: "+ sum/arr2.length);

        //Reverse
        for(int j=arr2.length-1;j>=0;j--)
        {
            System.out.println(arr2[j]);
            
        }


        //Multidimensional array
        int mulArr1[][]=new int[2][3];
        int mulArr2[][]={{1,2,3},{4,5,6}};

        for(int k=0;k<mulArr2.length;k++)
        {
            for(int l=0;l<mulArr2[k].length;++l)
            {
                System.out.print(mulArr2[k][l]); 
            }
            System.out.println();       
        }

        //Copy
        int[] cpArr=arr1;
        arr1[0]=20;
        for (int number: cpArr) {
            System.out.print(number);
        } 
        System.out.println("--------");

        //using looping
        int cpArr2[]=new int[arr1.length];

        for (int a = 0; a < arr1.length; a++) {
            cpArr2[a] = arr1[a];
        }

        for (int data:cpArr2)
        {
            System.out.print(data);
        }

        //using array copy
        int cpArr3[]=new int[arr1.length];
        System.arraycopy(arr1,0,cpArr3,0,3);
        System.out.println("Array = " + Arrays.toString(cpArr3));  

        //using copyOfRange
        int[] source = {2, 3, 12, 4, 12, 15};
      
        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);      
        System.out.println("destination1 = " + Arrays.toString(destination1)); 
       
        int[] destination2 = Arrays.copyOfRange(source, 2, 5); 
        System.out.println("destination2 = " + Arrays.toString(destination2));
    
        //copy od 2d Array
        int[][] s1={
            {1,2,3},{4,5,6}
        };

        int[][] d1=new int[s1.length][];
        for (int i1 = 0; i1 < d1.length; ++i1) {

            // allocating space for each row of destination array
            d1[i1] = new int[s1[i1].length];

            for (int j1 = 0; j1 < d1[i1].length; ++j1) {
                d1[i1][j1] = s1[i1][j1];
            }
        }

        System.out.println(Arrays.deepToString(d1));  

        int[][] des2=new int[s1.length][];
        for (int x = 0; x < s1.length; ++x) {

             // allocating space for each row of destination array
             des2[x] = new int[s1[x].length];
             System.arraycopy(s1[x], 0, des2[x], 0, des2[x].length);
        }
        System.out.println(Arrays.deepToString(des2));      

    }
}