import java.util.Scanner;

public class hcn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài");
        int cd = s.nextInt();

        System.out.println("Nhập vào chiều rộng");
        int cr = s.nextInt();

        int chuvi = (cd + cr) * 2;
        int dientich = cd * cr;

        System.out.println("Chu vi là: " + chuvi + " Diện tích: " + dientich);
    }
}
