import java.io.*;
public abstract class stream_example {
    public static void main(String[] args) {
        try {
            // File file = new File("test1.txt");
            // PrintWriter pw=new PrintWriter("test2.txt","UTF-8");
            // System.out.println(file.getCanonicalPath());
            // FileInputStream File_Input_Stream = new FileInputStream(file);
            // System.out.println(File_Input_Stream.available());
            //InputStream iStream=new FileInputStream(file);
           // System.out.println(iStream.available());
            // File file = new File("C:\\Users\\Aamir\\OneDrive\\Desktop\\test.txt");
            // String path = file.getAbsolutePath();
            //System.out.println(path);
            

            //file creating
            File myObj = new File("testing.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            //writing
            FileWriter myWriter = new FileWriter("testing.txt");
            myWriter.write("Hello, how are you?");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            
            //checking bytes
            byte[] array=new byte[100];
            InputStream inputStream=new FileInputStream("testing.txt");
            System.out.println("bytes are: "+ inputStream.available());
            
            //read
            inputStream.read(array);
            System.out.println("File contents are: ");

            String data=new String(array);
            System.out.println(data);

            //inputStream.close();

            //Output stream

            FileOutputStream outputStream = new FileOutputStream("testing.txt");
            String data2="Writing another line in a file";
            byte[] array2=data2.getBytes();
            outputStream.write(array2);
            System.out.println("Successfully written");
            outputStream.flush();
            outputStream.close();

            // inputStream.read(array2);
            // System.out.println("new contents are: ");
            // String newData=new String(array2);
            // System.out.println(newData);

            FileInputStream fileInputStream=new FileInputStream("testing.txt");
            System.out.println("Data is: ");
            fileInputStream.read();
            fileInputStream.read();
            fileInputStream.read();
            fileInputStream.skip(7);
            int i=fileInputStream.read();
            while (i!=-1) {
                System.out.print((char)i);
                i=fileInputStream.read();
                
            }
            System.out.println(fileInputStream.available());
            System.out.println(fileInputStream.available());
            System.out.println();
            fileInputStream.close();

            //Byte array input stream
            byte[] nums={1,2,3,4};
            ByteArrayInputStream byteArrayInputStream= new ByteArrayInputStream(nums);
            for (int j = 0; j < nums.length; j++) {
                int d=byteArrayInputStream.read();
                System.out.print(d +" ");
                
            }
            System.out.println();
            System.out.println(byteArrayInputStream.available());
            byteArrayInputStream.close();

            //Byte array output stream
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            byte[] readbytes=data2.getBytes();
            byteArrayOutputStream.write(readbytes);
            
            //using toString
            System.out.println(byteArrayOutputStream.toString());

            //using to byteArray
            byte[] byteData = byteArrayOutputStream.toByteArray();
            System.out.print("Data using toByteArray(): ");
            for(int l=0; l<byteData.length; l++) {
                System.out.print((char)byteData[l]);
            }

            //Object output stream
            String obj1="hello";
            int age=38;

            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(obj1);
            objectOutputStream.write(age);

            FileInputStream fIS=new FileInputStream("testing.txt");
            ObjectInputStream oIS=new ObjectInputStream(fIS);

            System.out.println(oIS.readObject());
            System.out.println(oIS.readInt());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
