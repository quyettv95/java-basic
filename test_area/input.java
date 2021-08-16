package test_area;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class input {
  public static void main(String[] args) {
    FileInputStream input;
    FileOutputStream output;
    String filePath = "/Users/quyettran/development/java/test_area/test3.txt";
    // try {
    //   output = new FileOutputStream(filePath);
    //   ObjectOutputStream objOut = new ObjectOutputStream(output);
    //   HCN h = new HCN(5, 10);
    //   objOut.writeObject(objOut);
    //   objOut.close();
    //   System.out.println("Success");
    // } catch (Exception e) {
    //   //TODO: handle exception
    // }

    ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            // create student
            // Student student = new Student(1, "Tran Hao Phong", "Ha Noi", 17);
            HCN h = new HCN(5, 10);

            // write student
            oos.writeObject(h);
            System.out.println("Success...");
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
        }
  }
}
