package study.ch16;

import lombok.*;

import javax.swing.text.Style;

@Getter
@Setter
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true)

class Student {
    @ToString.Include
    private String name;
    @ToString.Include
    public static String schoolName;

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public static String getSchoolName () {
        return schoolName;
    }

    public static Student getNewStudent(String name) {
      //  this.name = name;
        Student student = new Student();
        student.setName(name);
        return student;
    }
}

public class Static01 {
    static void main() {
     //   Student student = new Student();
     //   student.setName("노푸른");

        Student.setSchoolName("방통대");
        System.out.println(Student.getSchoolName());

        Student student = new Student();
        student.setName("노푸른");
        System.out.println(student);

       Student student2 = Student.getNewStudent("노푸니");
    }

}
