package study.ch09.Test;

public class Ex01 {
    static class Dog {
        String name;
        int age;
    }
    public class Main {
        public static void main(String[] args) {
            Dog d = new Dog();
            System.out.println(d.name);
            System.out.println(d.age);
        }
    }
}

//출력결과: 없음? 데이터값이 적혀지지 않음
