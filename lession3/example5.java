package lession3;

public class example5 {
    public static void main(String[] args) {
        int numbers[] = {6, 1, 2, 4, 3, 5};
        int temp;

        // i :0 -> n-2
        //     j: i+1 -> n-1

        // Vòng lặp 1: i=0, j  = i + 1 = 1
        // Vòng lặp 2: i=0, j++ = 2

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }


        // temp = numbers[0];
        // numbers[0] = numbers[4];
        // numbers[4] = temp;
        for (int x: numbers) {
            System.out.println(x);
        }
        // 1
        // 2
        // 3
        // 4
        // 5
    }
}
