package lession6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example1 {
  public static void main(String[] args) {
    try {
      int num1, num2, result;
      float div;
      Scanner s = new Scanner(System.in);
      num1 = s.nextInt();
      num2 = s.nextInt();
      result = num1 + num2;
      div = (float) num1 / num2;
      System.out.println("Tổng 2 số là:" + result);
      System.out.println("Thương 2 số là:" + div);
    }
    catch (InputMismatchException e)
    {
      System.out.println("Vui lòng kiểm tra lại số của bạn");
    }
    catch (ArithmeticException e)
    {
      System.out.println("Lỗi chia cho 0");
    }
    catch (Exception e)
    {
      System.out.println("Đã có lỗi xảy ra");
    }
    System.out.println("Đã hoàn thành chương trình");
  }
}
