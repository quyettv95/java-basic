import java.util.Scanner;

public class ptb2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập vào a");
        int a = s.nextInt();
        System.out.println("Nhập vào b");
        int b = s.nextInt();
        System.out.println("Nhập vào b");
        int c = s.nextInt();

        float delta = (float)(b*b - 4*a*c);
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            float nk = -b / (2 * a);
            System.out.println("Phương trình nghiệm kép: x1 = x2 =" + nk);
        } else {
            float x1 = (float)(-b + Math.sqrt(delta)) / (2 * a);
            float x2 = (float)(-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1:"  + x1);
            System.out.println("x2:"  + x2);
        }

    }
}
