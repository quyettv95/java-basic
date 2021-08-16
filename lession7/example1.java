package lession7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import test_area.test3.main;

public class example1 {
  public static void main(String[] args) {
    String path = "/Users/quyettran/development/java/lession7/test.txt";
    try {
      FileInputStream f = new FileInputStream(path);
      int data;
      String fileValue = "";
      while((data = f.read()) != -1) {
        // System.out.print((char)data);
        fileValue += (char)data;

      }
      String fileValueSegment[] = fileValue.split("\n");
      for (int i = 0; i < fileValueSegment.length; i++) {
        System.out.println("Line" + (i +1) + ": " + fileValueSegment[i]);
      }

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      // e.printStackTrace();
    } catch (IOException e) {

      System.out.println("Lỗi đọc file");

      e.printStackTrace();
    }


    // String path = "/f/javaIo/example/triangle.java";


  }
}

// cd :change directory
// ll :list
// touch <tên file>: lệnh tạo file
