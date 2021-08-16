package test_area;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class example_2 {
  public static void main(String[] args) {
      String filePath = "/Users/quyettran/development/java/test_area/test3.txt";
      File f = new File(filePath);
      try {
        System.out.println(f.createNewFile());
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      // try{
      //   FileWriter fw=new FileWriter(filePath);
      //   fw.write("Hello");
      //   fw.close();
      //  }catch(Exception e){System.out.println(e);}
      //  System.out.println("Success...");
    // try{
    //   FileInputStream fin=new FileInputStream(filePath);
    //   int i=fin.read();
    //   System.out.print((char)i);

    //   fin.close();
    // }catch(Exception e){System.out.println(e);}

    // try{
    //   FileOutputStream fout=new FileOutputStream(filePath);
    //   String s="Welcome to javaTpoint.";
    //   byte b[]=s.getBytes();//converting string into byte array
    //   fout.write(b);
    //   System.out.println("success...");
    // }catch(Exception e){System.out.println(e);}
    // try {


    //   FileInputStream file = new FileInputStream("/Users/quyettran/development/java/test_area/test.txt");
    //   // BufferedInputStream bin=new BufferedInputStream(file);
    //   // int i;
    //   // while((i=bin.read())!=-1){
    //   //  System.out.println((char)i);
    //   // }

    //   // bin.close();
    //   int data;
    //   while ((data = file.read()) != -1) {
    //     System.out.println((char)data);
    //   }
    //   // System.out.println(file.getFD());
    //   file.close();
    // } catch (Exception e) {
    //   System.out.println(e);
    //   //TODO: handle exception
    // }
  }
}
