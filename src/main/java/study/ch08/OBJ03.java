package study.ch08;

public class OBJ03 {
    static void main() {
        class Student {
            String name;
            int age;

            Student(String name, int age) {
                System.out.println("학생 생성");
                this.name = name;
                this.age = age;
            }

        }
        Student s1 = new Student("노푸른", 27);
        Student s2 = new Student("노연두", 26);
        Student s3 = new Student("노솔잎", 25);
    }
}
