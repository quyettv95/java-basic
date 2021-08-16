package lession3;

import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Mời bạn nhận số n: ");
        n = s.nextInt();
        int matrix[][] = new int[20][20];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Mời bạn nhập phần tử ở hàng " + (i + 1) + " cột " + (j + 1) + ":");
                matrix[i][j] = s.nextInt();
            }
        }
        int sumX = 0;
        int sumY = 0;
        int sumZ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumX += matrix[i][j];
                }
                if (i + j == n - 1) {
                    sumY += matrix[i][j];
                }

                if (matrix[i][j] % 2 == 0) {
                    sumZ += matrix[i][j];
                }
            }
        }

        System.out.println("Mã trận là:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========");
        System.out.println("Tổng chéo chính là:" + sumX);
        System.out.println("Tổng chéo phụ là:" + sumY);
        System.out.println("Tổng số chẵn là:" + sumZ);
        System.out.println("Các phần tử chia hết cho 3 & 5 là:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] % 3 == 0 && matrix[i][j] % 5 == 0) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // for(int rows[]: matrix) {
        //     for(int elem: rows) {
        //         System.out.print(elem + " ");
        //     }
        //     System.out.println();
        // }

        // Viết chương trình lấy từ bàn phím số n chính là độ dài ma trận
        // Đọc ma trận

        // In ra tổng đường chéo chính
        // In ra tổng đường chéo phụ
        // In ra tổng tất cả phẩn tử chẵn
        // In ra số chia hết cho 3 và 5
    }
}
