package lession2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số");
        int num = s.nextInt();

        if (num % 2 == 0) {
            if (num % 3 == 0 || num % 5 == 0) {
                System.out.println("Valid");
            }
        }




        // if (num > 8.5) {
        //     System.out.println("Loại xuất sắc");
        // }
        // if (num > 8) {
        //     System.out.println("Loại giỏi");
        // }
    }
}
