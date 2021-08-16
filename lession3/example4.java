package lession3;

public class example4 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 3, 5};
        boolean isAsc = true;
        for (int index = 0; index < numbers.length - 1; index++) {
            if (numbers[index + 1] < numbers[index]) {
                isAsc = false;
                break;
            }
        }
        if (isAsc) {
            System.out.println("Mảng tăng dần");
        } else {
            System.out.println("Mảng không tăng dần");
        }
    }
}
