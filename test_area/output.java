package test_area;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class output {
  public static void main(String[] args) {
    // FileInputStream input;
    // FileOutputStream output;
    // String filePath = "/Users/quyettran/development/java/test_area/test3.txt";
    // try {
    //   input = new FileInputStream(filePath);
    //   ObjectInputStream objInput = new ObjectInputStream(input);
    //   HCN h = (HCN) objInput.readObject();
    //   System.out.println(h.toString());
    //   System.out.println("Success");
    // } catch (Exception e) {
    //   System.out.println(e);
    //   //TODO: handle exception
    // }

    ObjectInputStream ois = null;
    String filePath = "/Users/quyettran/development/java/test_area/test3.txt";
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            // read student
            HCN hcn = (HCN) ois.readObject();
            // show student
            System.out.println(hcn.toString());
            System.out.println(hcn.getSquare());

            ois.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
        }
  }
}
