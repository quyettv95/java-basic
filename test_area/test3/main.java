package test_area.test3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class main {
  public static void main(String[] args) {
    String filePath = "/Users/quyettran/development/java/test_area/test3.txt";
    ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            // create student
            Student student = new Student(1, "Tran Hao Phong", "Ha Noi", 17);
            // write student
            oos.writeObject(student);
            System.out.println("Success...");
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
        }

  }
}
