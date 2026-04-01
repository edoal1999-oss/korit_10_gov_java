package study.ch10;

import study.ch10.entity.Student;

public class Array09 {
    static void main() {
        Student [] students = new Student[3];
        students[0] = new Student("노푸른", 80);
        students[1] = new Student("노연두", 90);
        students[2] = new Student("노주황", 100);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            students[i].setScore(students[i].getScore()-5);
        }

        for (Student student : students) {
            student.setScore(student.getScore()-5);
        }

        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}
