package study.ch09;

import study.ch09.entity.Teacher;
import study.ch09.entity.User;

public class Main {
    static void main() {
        Student s1 = new Student();
        s1.name = "노푸른";
        s1.age = 28;
        s1.printInfo();

        Teacher t1 = new Teacher();
        t1.name = "김준일";
        t1.age = 33;
        t1.printInfo();

        User user = new User("hipoony");
        user.setPassword("1111");
        user.setName("노푸른");
        System.out.println(user.getUsername());
    }
}
