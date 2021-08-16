package test_area;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class array_3 {
    public static void main(String[] args) {
        System.out.println("HELO");
        // int[] numbers = {10, 10, 20};
        Integer[] numbers = new Integer[] {1,10,15, 10};
        Arrays.sort(numbers, Collections.reverseOrder());
        for (int x: numbers) {
            System.out.println(x);
        }
    }
}
