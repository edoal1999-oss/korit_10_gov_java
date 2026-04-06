package study.ch13;

abstract class Person {
    private String lastName;
    private String firstName;

    public abstract void showName();
    public void showName2() {

    }
}

interface Person2 {
    String lastName = "";
    String firstName = "";

    void showName();
    default void showName2() {

    }
}

//추상 메서드는 앞에 무조건 붙여야하지만, 인터페이스는 그 자체가 메서드이기 때문에 생략 가능
//인터페이스는 무조건 자식 클래스에게 정보를 인계하는 설계도이므로 무조건 public

class Student extends Person {
    @Override
    public void showName() {

    }
}

class Student2 implements Person2 {
    @Override
    public void showName() {

    }
}

public class Main {
    static void main() {
        Person p1 = new Student(); //추상클래스
        Person2 p2 = new Student2(); //인터페이스
    }
}
