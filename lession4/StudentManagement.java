package lession4;

public class StudentManagement {
    Student students[] = new Student[100];
    int totalStudent = 0;

    void add(Student std) {
        this.students[totalStudent] = std;
        this.totalStudent++;
    }

    void delete(String code) {
        Student _students[] = new Student[100];
        int _totalStudent = 0;
        for(int i = 0; i < this.totalStudent; i++) {
            Student currentStd = this.students[i];
            if (currentStd.code != code) {
                _students[_totalStudent] = currentStd;
                _totalStudent++;
            }
        }
        this.students = _students;
        this.totalStudent = _totalStudent;
    }

    Student search(String code) {
        Student st = new Student();
        for(int i = 0; i < this.totalStudent; i++) {
            Student currentStd = this.students[i];
            if (currentStd.code == code) {
                st = currentStd;
            }
        }

        return st;
    }

    void displayByAscScore(String code) {

    }

}
