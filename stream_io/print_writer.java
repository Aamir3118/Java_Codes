import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class print_writer {
    public static void main(String[] args) {
        try {
            PrintWriter pWriter=new PrintWriter("demo.txt");
            pWriter.write("this is print writer");
            int age=23;
            pWriter.printf("I am %d years old.", age);

            pWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }
}
