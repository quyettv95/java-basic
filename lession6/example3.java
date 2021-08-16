package lession6;

public class example3 {
  public static void main(String[] args) {
    ThrowDemo td = new ThrowDemo();
    try {
      td.display();
    } catch (Exception e) {
      System.out.println(e);
      System.out.println("Đã có lỗi xảy ra");
    }
    finally
    {
      System.out.println("Đã thực hiện xong chương trình");
    }

  }
}
