package test_area;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class array_7 {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("Helsadas;dsa;das;dsa", ";", false);
        while(str.hasMoreTokens()) {
            System.out.println(str.nextElement());
        }
    }
}
