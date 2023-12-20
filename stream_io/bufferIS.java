import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class bufferIS {
    public static void main(String[] args) {
        try {
            // Buffer input stream
            FileInputStream fileIS = new FileInputStream("testing.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileIS);
            int i = bufferedInputStream .read();

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = bufferedInputStream.read();
            }
            bufferedInputStream.close();

            //BufferOutput

            String data="hey";
            FileOutputStream fileOS = new FileOutputStream("testing.txt");
            BufferedOutputStream output = new BufferedOutputStream(fileOS);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
            fileIS.close();
            fileOS.close();

            //PrintStream
            PrintStream printStream = new PrintStream("newF.txt");
            int age=25;
            printStream.print(data);
            printStream.printf("I am %d years old", age);
            printStream.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
