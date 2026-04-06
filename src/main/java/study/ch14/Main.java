package study.ch14;

class Animal {

}

class Duck extends Animal {
    //Animal이 Object를 상속받고 있기에, Object->Animal로 제정 가능
}

public class Main {
    static void main() {
        //최상위 객체 (Object)
        //모든 클래스는 만들어질 때부터 Object가 상속되어 있다

        Object a = 10;
        Object b = 3.14;
        Object c = "노푸른";
        Object d = 'a';
        Object e = new Animal();

        //Wrapper Class(래퍼 클래스)
        Integer integer = (Integer) 10; //일반 자료형 => 클래스 자료형 (Boxing)
        int i = (int) integer; //클래스 자료형 -> 일반 자료형 (Unboxing)
        // 자바는 Boxing, Unboxing이 자동 -> AutoBoxing

        //int i2 = null; null 대입하는 건 불가능함. 오류남.
        Integer integer2 = null;

        System.out.println(((int)a) +((double)b));

    }
}
