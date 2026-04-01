package study.ch7.ex;

public class Ex04 {
    static void main() {
        int score = 95;
        if (score >= 60) {
            System.out.println("D");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 90) {
            System.out.println("A");
        }
    }
}

//출력결과: D
//문제점: score 값을 판정하는 식 중 첫번째 식만 적용되었다. 이 문제는 해당 식의 순서를 반대로 입력하면 해결할 수 있다.
