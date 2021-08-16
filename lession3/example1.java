package lession3;

public class example1 {
    public static void main(String[] args) {
        int evenNumbers[] = {2, 4, 6, 8};
        System.out.println(evenNumbers[0]);
        System.out.println(evenNumbers[evenNumbers.length - 1]);

        for (int index = 0; index < evenNumbers.length; index++) {
            System.out.println(evenNumbers[index]);
        }
        int sum = 0;
        for (int x: evenNumbers) {
            sum += x;
        }

        System.out.println("Tổng là: " + sum);
    }
}
