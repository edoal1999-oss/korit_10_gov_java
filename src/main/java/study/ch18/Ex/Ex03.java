package study.ch18.Ex;

class Student {
    String name;
    int id;
    static int nextid = 1;

    public Student(String name) {
        this.name = name;
        this.id = nextid++;
    }

    public static int getStudentCount() {
        return nextid++;
    }
}

public class Ex03 {
    static void main() {
        Student s1 = new Student("김");
        Student s2 = new Student("이");
        Student s3 = new Student("박");
        System.out.println(Student.getStudentCount());
    }
}

//출력결과: 4