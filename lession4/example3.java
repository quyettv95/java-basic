package lession4;

public class example3 {
    public static void main(String[] args) {
        StudentManagement stManage = new StudentManagement();
        Student std = new Student("123", "Tran Van Quyet", "Ha Noi", "Male", 10);
        Student std2 = new Student("456", "Nguyen Thi Binh", "Ha Tay", "FeMale", 5);
        Student std3 = new Student("789", "Nguyen Thi Trang", "Thanh Hoa", "FeMale", 6);
        stManage.add(std);
        stManage.add(std2);
        stManage.add(std3);
        // System.out.println(stManage.totalStudent);
        // stManage.delete("123");
        String code = "123";
        Student searchStudent = stManage.search(code);

        if (searchStudent.fullname != null) {
            System.out.println("Đã tìm thấy sinh viên: " + searchStudent.fullname);
        } else {
            System.out.println("Không tìm thấy sinh viên có mã:" + code);
        }
        // for(Student s: stManage.students) {
        //     System.out.println(s.fullname);
        // }
        // System.out.println(stManage.totalStudent);
        // System.out.println(stManage.students[0].fullname);
    }
}
