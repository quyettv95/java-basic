package lession2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập điểm");
        Float num = s.nextFloat();

        if (num > 8.5) {
            System.out.println("Loại xuất sắc");
        } else if (num > 8) {
            System.out.println("Loại giỏi");
        } else if (num > 6.5) {
            System.out.println("Loại khá");
        } else if (num > 4) {
            System.out.println("Loại Trung bình");
        } else {
            System.out.println("Kém");
        }


        // if (num > 8.5) {
        //     System.out.println("Loại xuất sắc");
        // }
        // if (num > 8) {
        //     System.out.println("Loại giỏi");
        // }
    }
}
