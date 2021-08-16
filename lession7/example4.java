package lession7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import lession4.Point;

public class example4 {
  public static void main(String[] args) {
    String path2 = "/Users/quyettran/development/java/lession7/p1.txt";
    try {
      FileInputStream fp1 = new FileInputStream(path2);
      ObjectInputStream ois = new ObjectInputStream(fp1);
      Point p = (Point) ois.readObject();
      // System.out.println(p);
      p.display();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
