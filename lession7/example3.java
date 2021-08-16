package lession7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;

import lession4.Point;

public class example3 {
  public static void main(String[] args) {
    // Point (x, y)
    // Triangle (Point a, Point b, Point c)
    // Tạo chương trình đọc tọa độ từ file triangle.txt
    // Hiển thị diện tích/chu vi của tam giác đấy
    // String str = "6,7";
    // String strSeg[] = str.split(",");
    // int x = Integer.valueOf(strSeg[0]);
    // int y = Integer.valueOf(strSeg[1]);
    // System.out.println(x + y);

    // Point p1 = new Point (0, 0);
    // Point p2 = new Point (6, 7);
    // Point p3 = new Point (8, 2);

    // Triangle tri = new Triangle(p1, p2, p3);

    DecimalFormat df2 = new DecimalFormat("#.###");
    // System.out.println("Chu vi tam giác: " + df2.format(tri.getChuVi()));
    // System.out.println("Chu vi diện tích: " + df2.format(tri.getDienTich()));

    // String path = "/Users/quyettran/development/java/lession7/";
    // String path2 = "/Users/quyettran/development/java/lession7/quyettv.txt";
    // File f2 = new File(path);
    // File f3 = new File(path2);
    // // f2.renameTo(f3);
    // System.out.println(f2.getPath());
    // System.out.println(f2.isFile());
    // System.out.println(f2.isDirectory());
    // if (!f3.exists()) {
    //   try {
    //     f3.createNewFile();
    //   } catch (IOException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    //   }
    // }
    // System.out.println(f2.exists());

    try {
      String path = "/Users/quyettran/development/java/lession7/triangle.txt";

      FileInputStream f = new FileInputStream(path);
      String fileValue = "";
      int data;
      while ((data = f.read()) != -1) {
        fileValue += (char) data;
      }
      String fileSeg[] = fileValue.split("\n");
      Point p1 = new Point(fileSeg[0]);
      Point p2 = new Point(fileSeg[1]);
      Point p3 = new Point(fileSeg[2]);
      String path2 = "/Users/quyettran/development/java/lession7/triangle2.txt";
      FileOutputStream f2 = new FileOutputStream(path2);
      ObjectOutputStream oos = new ObjectOutputStream(f2);
      // FileOutputStream fPoint1 = new FileOutputStream(path2);
      // ObjectOutputStream oos = new ObjectOutputStream(fPoint1);
      // oos.writeObject(p2);

      // System.out.println(p2);
      Triangle tri = new Triangle(p1, p2, p3);
      // System.out.println(tri);
      oos.writeObject(tri);
      oos.close();
      // System.out.println(df2.format(tri.getChuVi()));
      // for (int i = 0; i < fileSeg.length; i++) {
      //   System.out.print(fileSeg[i]);
      // }
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }


  }
}
