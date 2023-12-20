import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class file_example {
    public static void main(String[] args) {
        try 
        {

            File file=new File("new_file.txt");
            //creating and checking file
            if(file.createNewFile())
            {
                System.out.println("created file");
            }
            else
            {
                System.out.println("File alredy exists");
            }

            //FileWriter
            char array[]=new char[100];
            FileWriter fileWriter=new FileWriter("new_file.txt");
            fileWriter.write("Hello\n");
            fileWriter.append("working with file");
            fileWriter.close();

            //File reader
            FileReader fReader=new FileReader("new_file.txt");
            fReader.read(array);
            System.out.println("File contents are: ");
            System.out.println(array);
            fReader.close();

            //deleting a file
            File file2=new File("testing2.txt");
            if(file2.delete())
            {
                System.out.println("Deleted successfully");
            }
            else
            {
                System.out.println("Not able delete!");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
