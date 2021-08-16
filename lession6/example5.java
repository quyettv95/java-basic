package lession6;

public class example5 {
  public static void main(String[] args) {
    // ResouceX x = new ResouceX();
    // try {
    //   String message = x.getMessage();
    //   System.out.println(message);
    // } catch (Exception e) {
    //   System.out.println("Đã có lỗi xảy ra");
    // } finally {
    //   x.close();
    // }


    try (ResouceX x = new ResouceX();) {
      String message = x.getMessage(false);
      System.out.println(message.toString());
    } catch (Exception e) {
      System.out.println(e);
      System.out.println("Đã có lỗi xảy ra");
    }


  }
}
