class Test6 {
    public static void main(String args[]) {
        int a = 5;
        int b = 100;
        int c = 7;
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        System.out.println("Số lơn nhất là: " +max);
    }
}