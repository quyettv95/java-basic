package lession2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Vui lòng nhập số cần kiểm tra");
        int num = s.nextInt();
        if (num % 5 == 0) {
            System.out.println("Số " + num + " chia hết cho 5");
        } else {
            System.out.println("Số " + num + " không chia hết cho 5");
        }
    }
}
