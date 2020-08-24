package IO_05;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myIO\\src\\IO_05\\oos2.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();
    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myIO\\src\\IO_05\\oos2.txt"));
        Student s = new Student("yy", 9);
//        System.out.println(s.toString());
        oos.writeObject(s);
        oos.close();
    }
}
