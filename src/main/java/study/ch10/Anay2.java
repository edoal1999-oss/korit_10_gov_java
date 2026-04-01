package study.ch10;

public class Anay2 {
    static void main() {
        int[] iArr = { 1, 2, 3, 4, 5};
        char[] cArr = { 'a', 'b', 'c'};
        boolean[] bArr = { true, false, true, false};
        double[] dArr = {1.0, 3.14, 5.5};
        String[] sArr = {"노푸른", "노연두", "노주황"};

        class Student {
            private String name;

            Student() {}

            Student(String name){

                this.name = name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        Student[] students = {
                new Student("노푸른"),
                new Student("노연두"),
                new Student("노주황")};
        Student[] students2 = { new Student(), new Student(), new Student()};
        students2[0].setName ("노푸른");
        students2[1].setName ("노연두");
        students2[2].setName ("노주황");
    }
}
