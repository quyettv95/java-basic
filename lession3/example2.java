package lession3;

public class example2 {
    public static void main(String[] args) {
        String names[] = {
            "Nam", //=> 0
            "An", //=> 1
            "Khánh", //=> 2
            "Toàn", //=> 3
        };
        String name2s[] = new String[2];
        name2s[0] = "A";
        // name2s[1] = "B";
        System.out.println(name2s.length);
        for (String s: name2s) {
            System.out.println(s);
        }
        // System.out.println(names[0]);
        // System.out.println(names[names.length - 1]);
        // names[0] = "Thanh";
        // for (int index = 0; index < names.length; index++) {
        //     System.out.println(names[index]);
        // }
        // // int sum = 0;
        // for (String x: names) {
        //     System.out.println(x);
        // }

        // System.out.println("Tổng là: " + sum);
    }
}
