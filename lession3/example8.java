package lession3;

public class example8 {
    public static void main(String[] args) {
        String st = " This s a paragraph ";

        System.out.println(st.length());
        System.out.println(st.charAt(st.length() - 1));

        // if (st.startsWith("this")) {
        //     System.out.println("Có");
        // } else {
        //     System.out.println("Không");
        // }

        if (st.endsWith("phd")) {
            System.out.println("Có");
        } else {
            System.out.println("Không");
        }

        System.out.println(st.indexOf("is"));
        System.out.println(st.lastIndexOf("is"));
        System.out.println(st.substring(4));
        System.out.println(st.substring(0, 4));
        System.out.println(st.replace("paragraph", "new Para"));
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.trim());

        String str1 = "HeLlO";
        String str2 = "hellO";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

    }
}
