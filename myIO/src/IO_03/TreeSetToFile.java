package IO_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetToFile {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num1 = o2.getSum() - o1.getSum();
                int num2 = num1 == 0 ? o2.getChinese() - o1.getChinese() : num1;
                int num3 = num2 == 0 ? o2.getMath() - o1.getMath() : num2;
                int num4 = num3 == 0 ? o2.getName().compareTo(o1.getName()) : num3;
                return num4;
//                return -1;
            }
        });

        Student s1 = new Student("uu", 99, 10, 89);
        Student s2 = new Student("pp", 99, 89, 10);
        Student s3 = new Student("yy", 48, 89, 10);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\src\\IO_03\\ts.txt"));

        for (Student s : ts
        ) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
