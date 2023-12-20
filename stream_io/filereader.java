import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class filereader {
    public static void main(String[] args) {
        char ch[]=new char[100];
        char ch2[]=new char[100];
        try {
            FileReader fileReader=new FileReader("testing.txt");   
            fileReader.read(ch);
            System.out.println(ch);

            //File writer
            FileWriter fileWriter= new FileWriter("testing.txt");
            String data="Java Practice";
            fileWriter.write(data);
            fileWriter.append("Append");
            fileWriter.close();

            fileReader.close();

            //Buffer reader
            File f=new File("demo.txt");
            if(f.createNewFile())
            {
                System.out.println("File created");
            }
            else
            {
                System.out.println("Already present");
            }

            FileReader fileReader2=new FileReader("demo.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader2);
            bufferedReader.read(ch2);
            System.out.println("Data is: ");
            System.out.println(ch2);

            //buffer writer
            FileWriter fileWriter2=new FileWriter("demo.txt");
            BufferedWriter bWriter=new BufferedWriter(fileWriter2);
            bWriter.write("hey");
            bWriter.append("\n Welcome to programming world");

            bufferedReader.close();
            bWriter.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }    
}
