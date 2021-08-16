package test_area;

import java.util.InputMismatchException;
import java.util.Scanner;

public class array_9 {
    public static void hello() throws Exception
    {
        throw new Exception();
        // System.out.println(1/0);
        // System.out.println("1/0");
    }

    public static void main(String[] args) {
        // array_9 a = new array_9();
        try {
            hello();
        } catch (Exception e) {
            System.out.println(e);
        }
        // HCN hcn = new HCN(10, 100);
        // System.out.println(hcn.getSquare());
        // try {
        //     Scanner s = new Scanner(System.in);
        //     s.nextInt();
        // } catch (InputMismatchException e) {
        //     //TODO: handle exception
        //     System.out.println(e);
        // }
    }
}
