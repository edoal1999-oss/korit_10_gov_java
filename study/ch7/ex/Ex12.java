package study.ch7.ex;

public class Ex12 {
    static void main() {
        int num = 2;
        switch (num) {
            case 1 : System.out.println("A");
            case 2 : System.out.println("B");
            case 3 : System.out.println("C");
            default: System.out.println("기타");
        }
    }
}

//출력 결과: B, C, 기타.
//break가 누락되어서 밑의 식들에도 변수가 반응함.
