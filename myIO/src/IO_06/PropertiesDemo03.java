package IO_06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException{
//        myStore();
        myLoad();
    }

    private static void myLoad() throws IOException{
        Properties pro = new Properties();
        FileReader fr = new FileReader("myIO\\src\\IO_06\\fw.txt");
        pro.load(fr);
        fr.close();
        System.out.println(pro);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("09","pp");
        prop.setProperty("88","uu");

        FileWriter fw = new FileWriter("myIO\\src\\IO_06\\fw.txt");
        prop.store(fw,null); //comments 描述信息
        fw.close();
    }
}
