package study.ch18.Ex;

class Myclass {
    int instanceVar = 10;
    static int staticVar = 20;

    static void staticMethod() {
        System.out.println(staticVar);
       // System.out.println(instanceVar);
       // instanceMethod();
       // System.out.println(this);
    }
    void instanceMethod () {
        System.out.println(staticVar);
        staticMethod();
    }
}
public class Ex02 {
}

//2,3,4  2번은 비 static 필드여서 static 컨텍스트에 참여할 수 없음. 3번도 마찬가지. 4번은 static에 this 못 씀.
