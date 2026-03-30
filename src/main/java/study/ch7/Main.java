package study.ch7;

public class Main {
    static void main() {
        System.out.println("프로그램 실행");
        int input1 = 10;
        int input2 = 5;
        for (int i = input1; i > 0; i--) {
            System.out.println(input1 - i);
            for(int j = 0; j < input2; j++) {
                int num = 1;
//                if (j == 0) {
//                    System.out.println((5 - i) * 10);
//                } else if (j == 1) {
//                    System.out.println((5 - i) * 100);
//                } else {
//                    System.out.println((5 - i) * 1000);}
                for (int k = 0; k < j + 1; k++) {
                    num *= 10;
                }
                System.out.println((input1 - i) * num);
            }
        } System.out.println("프로그램 종료");
    }
}


