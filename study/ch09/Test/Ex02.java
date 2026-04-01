package study.ch09.Test;

public class Ex02 {
    static class Cat {
        String name;

        Cat(String name) {
            this.name = name;
            System.out.println(name + "탄생!");
        }
    }
    public class Main {
        static void main() {
            Cat c1 = new Cat("나비");

        }
    }
}
