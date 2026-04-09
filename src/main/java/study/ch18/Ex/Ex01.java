package study.ch18.Ex;

class Counter {
    static int count = 0;
    String name;

    Counter(String name) {
        this.name = name;
        count++;
    }
}
public class Ex01 {
    static void main() {
        Counter c1 = new Counter("A");
        Counter c2 = new Counter("B");
        Counter c3 = new Counter("C");
        System.out.println(Counter.count);
        System.out.println(c1.count);
    }
}

//출력 결과: 3 3
