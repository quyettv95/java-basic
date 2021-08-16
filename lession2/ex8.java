package lession2;

public class ex8 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 25, 6};
        int sum = 0;

        // for (int index = 0; index < numbers.length; index++) {
        //     sum += numbers[index];
        // }
        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Sum of array: " + sum);
    }

}
