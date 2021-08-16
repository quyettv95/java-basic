package test_area;

public class array_2 {
    public static void main(String[] args) {
        System.out.println("HELO");
        // int[] numbers = {10, 10, 20};
        int[][] numbers = new int[2][3];
        numbers[0][1] = 1;
        for (int number[]: numbers) {
            for (int x: number) {
                System.out.println(x);
            }
        }
    }
}
