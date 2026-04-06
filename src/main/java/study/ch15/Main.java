package study.ch15;

public class Main {
    static void main() {
        Student student = new Student("노푸른", 27);
        student.setName("노푸른");
        student.setAge(27);
        System.out.println(student);

        Student student2 = new Student("노푸른", 27, "온천동");
        System.out.println(student2);

        final String data = "임시 데이터"; //final: 상수, 값은 변할 수 없다.
        // data= "test"; 상수는 한번 초기화 후 변경할 수 없다.
        System.out.println(data);

        final String data2; //상수 선언
        data2 = "test"; //선언만 하고 초기화는 안했음.
        //data2 = "test2"; 초기화는 1번만 가능. 상수는 무조건 초기화 해야함.

        Student student3 = new Student("노푸른", 27);

        Main.main();
    }
}
