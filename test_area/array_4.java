package test_area;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class array_4 {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[] {
            15,
            9,
            16,
            2,
            30
        };

        // Sorting int Array in descending order
        Arrays.sort(intArray, Collections.reverseOrder());
        for (int x: intArray) {
            System.out.println(x);
        }
    }
}
