package test_area;

import java.io.Serializable;

public class HCN implements Serializable{
    private static final long serialVersionUID = 1L;
    private int a;
    private int b;
    public static String abc = "100";

    public HCN(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int getSquare()
    {
        return this.a * this.b;
    }

    public void printNumber(int...numbers)
    {
        for (int x:numbers) {
            System.out.println(x);
        }
    }

    public static void print()
    {
        System.out.println(abc);
    }

    @Override
    public String toString() {
        return "HCN@[a=" + a + ",b =" + b+ "]";
    }
}
