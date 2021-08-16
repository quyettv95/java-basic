package lession3;

public class example9 {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder("Java Class");
        StringBuilder strBuilder2 = new StringBuilder(".NET Class");
        // System.out.println(strBuilder.append(strBuilder2));
        // System.out.println(strBuilder.delete(0,5));
        System.out.println(strBuilder.insert(4, " HELLO"));
    }
}
