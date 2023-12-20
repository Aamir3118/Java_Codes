import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

public class string_reader_writer {
    public static void main(String[] args) {
            char ch[]=new char[100];
            try {
                File f=new File("demo2.txt");
                if(f.createNewFile())
                {
                    System.out.println("File created");
                }
                else
                {
                    System.out.println("Already present");
                }
                String data="Hello world";
                StringReader stringReader=new StringReader(data);
                stringReader.read(ch);

                //String writer
                StringWriter stringWriter=new StringWriter(5);
                stringWriter.write("hello world");

                StringBuffer stringBuffer=stringWriter.getBuffer();
                System.err.println("buffer: "+stringBuffer);
                stringWriter.close();
                stringReader.close();

            } catch (Exception e) {
                // TODO: handle exception]
                System.out.println(e);
            }
    }
}
