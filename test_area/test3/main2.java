package test_area.test3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class main2 {
  public static void main(String[] args) {
    ObjectInputStream ois = null;
    String filePath = "/Users/quyettran/development/java/test_area/test3.txt";
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            // read student
            Student student = (Student) ois.readObject();
            // show student
            System.out.println(student.toString());
            System.out.println(student.getName());
            ois.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
        }
  }
}
