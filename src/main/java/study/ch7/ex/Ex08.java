package study.ch7.ex;

public class Ex08 {
    static void main() {
        int year = 2024;
        if (year % 400 == 0) {
            System.out.println("윤년");
        } else if (year % 100 == 0) {
            System.out.println("평년");
        } else if (year % 4 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }
    }
}

//결과: 윤년
