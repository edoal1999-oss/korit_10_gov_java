package study.ch7.ex;

public class Ex09 {
    static void main() {
        int month = 7;
        if (5 >= month && month >= 3){
            System.out.println("봄");
        } else if (month >= 6 && 8 >= month) {
            System.out.println("여름");
        } else if (month >= 9 && 11 >= month) {
            System.out.println("가을");
        } else {
            System.out.println("겨울");
        }
    }
}

//출력값: 여름
