package study.ch7.ex;

public class Ex13 {
    static void main() {
        int day = 5;
        switch (day) {
            case 1 : System.out.println("월"); break;
            case 2 : System.out.println("화"); break;
            case 3 : System.out.println("수"); break;
            case 4 : System.out.println("목"); break;
            case 5 : System.out.println("금"); break;
            case 6 : System.out.println("토"); break;
            case 7 : System.out.println("일"); break;
            default: System.out.println("기타"); break;
        }
    }
}

//출력결과: 금
