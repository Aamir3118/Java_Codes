public class multiply_two_matrix {
    public static void main(String[] args) {
        //Matrix 1
        int[][] arr1={{1,2,3},{4,5,6}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("--------");

        //Matrix 2
        int[][] arr2={{1,2,3},{4,5,6}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------");
        //Multiply
        int mul=1;
        int[][] multiply_res=new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                multiply_res[i][j]=arr1[i][j]*arr2[i][j];
            }
        }

        for (int j = 0; j < 2; j++) {
            for (int j2 = 0; j2 < 3; j2++) {
                System.out.print(multiply_res[j][j2]+" ");
            }
            System.out.println();
        }
    }
}
