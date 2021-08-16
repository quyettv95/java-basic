package lession2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập ngôn ngữ");
        String lang = s.next();

        switch (lang) {
            case "en":
                System.out.println("Hello");
                break;
            case "cn":
                System.out.println("你好");
                break;
            case "vi":
                System.out.println("Xin chào");
                break;
            default:
                System.out.println("Ngôn ngữ không tồn tại");
        }

        if (lang == "en") {
            System.out.println("Hello");
        } else if (lang == "cn") {
            System.out.println("你好");
        } else if (lang == "vi") {
            System.out.println("Xin chào");
        } else {
            System.out.println("Ngôn ngữ không tồn tại");
        }


    }
}
