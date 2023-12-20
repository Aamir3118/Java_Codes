import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class character_stream {
    public static void main(String[] args) {
        char ch[]= new char[100];
        char ch2[]= new char[100];
        try {

            //Reader
            Reader reader= new FileReader("testing.txt");
            System.out.println("is ready to read? "+reader.ready());
            reader.read(ch);

            //read data
            System.out.println("data");
            System.out.println(ch);

            //Writer
            String data="I am a Developer";
            Writer writer = new FileWriter("testing.txt");
            writer.append(data);
            reader.close();
            writer.close();

            //InputStream Reader
            FileInputStream fis = new FileInputStream("testing.txt");
            InputStreamReader isr=new InputStreamReader(fis);
            isr.read(ch2);
            System.out.println("-------------");
            System.out.println("encoding: "+isr.getEncoding());
            System.out.println(ch2);

            //Output stream writer
            FileOutputStream fos=new FileOutputStream("testing.txt");
            OutputStreamWriter osr=new OutputStreamWriter(fos);
            osr.append("Hey, how are you?");
            osr.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
