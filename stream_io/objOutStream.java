import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable
{
    String nm;
    int rollNo;

    Student(String nm,int rollNo)
    {
        this.nm=nm;
        this.rollNo=rollNo;
    }
}

public class objOutStream {
    public static void main(String[] args) {
        Student stu=new Student("Aamir",5);
        try {
            //file creating
            File myObj = new File("testing2.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            
            FileOutputStream file = new FileOutputStream("testing2.txt");

            // Creates an ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writes objects to the output stream
            output.writeObject(stu);

            FileInputStream fileStream = new FileInputStream("testing2.txt");

            // Creates an ObjectInputStream
            ObjectInputStream input = new ObjectInputStream(fileStream);

            // Reads the objects
            Student newStu = (Student) input.readObject();

            System.out.println("Student Name: " + newStu.nm);
            System.out.println("Student Roll No: " + newStu.rollNo);
            
            // Buffer input stream
            FileInputStream fileIS = new FileInputStream("testing3.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileIS);
            int i = bufferedInputStream .read();

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = bufferedInputStream.read();
            }
            bufferedInputStream.close();
            output.close();
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
