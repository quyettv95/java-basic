class Test7 {
    public static void main(String args[]) {
        int gender = 2;
        String genderStr;
        genderStr = gender == 1 ? "Nam" : "Nữ";

        if (gender == 1) {
            genderStr = "Nam";
        } else {
            genderStr = "Nữ";

        }

        System.out.println("Gender: " +genderStr);
    }
}