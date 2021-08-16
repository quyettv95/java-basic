package test_area;

import java.util.Scanner;
import java.io.File;
import java.lang.RuntimeException;

public class example {
  public static void main(String[] args) {
      try {
        throw new RuntimeException("Heloo");
      } catch (Exception e) {
        System.out.println(e.getMessage());
        throw e;
        //TODO: handle exception
      }
        // int num1, num2, result;
        // Scanner obj1 = new Scanner(System.in);
        // System.out.println("Enter the 1st number");
        // num1 = obj1.nextInt();
        // System.out.println("Enter the 2nd number");
        // num2 = obj1.nextInt();
        // result = num1+num2;
		    // System.out.println("The result is 			 "+result);
    	 }

}
