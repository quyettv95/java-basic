package lession7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class example2 {
  public static void main(String[] args) {
    String path = "/Users/quyettran/development/java/lession7/test.txt";
    try {
      FileOutputStream f = new FileOutputStream(path);
      String messsage = "Hello\tjava\nTEST";
      f.write(messsage.getBytes());
      f.close();
    } catch (FileNotFoundException e) {
      // e.printStackTrace();
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("Có lỗi khi ghi file");
      // e.printStackTrace();
    }
  }
}
