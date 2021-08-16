package lession2;

import java.util.Scanner;

public class ngay {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Nhap vao so thang");
		int a = s.nextInt();
		if(a<0 && a>13) {
			System.out.println("Thang khong hop le");
		}
		else {
			switch (a) {
			case 1:
				System.out.println("Thang 1");
				break;
			case 2:
				System.out.println("Thang 2");
				break;
			case 3:
				System.out.println("Thang 3");
				break;
			}
		}

	}

}