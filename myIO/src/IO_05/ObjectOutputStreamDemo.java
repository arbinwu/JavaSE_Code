package IO_05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myIO\\src\\IO_05\\oos.txt"));
        Student s = new Student("pp",30);
        oos.writeObject(s);
        oos.close();
    }
}
