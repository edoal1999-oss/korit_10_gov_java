package study.ch5;

public class Main {
    static void main() {
        int num = 12;
        boolean result = num % 2 == 0;
//        if (result) System.out.println(num * 10);
//        if (!result) System.out.println(num * 20);
        if (result) {
            System.out.println(num * 10);
            System.out.println("짝수");
        } else {
            System.out.println(num * 20);
            System.out.println("홀수");
        }

        //num의 값이 짝수면 num에 10을 곱하고 짝수가 아니면 20을 곱하여 결과를 출력해라

        int num2 = 14;
        if (num2 % 8 == 0) {
            System.out.println("8의 배수");
        } else {
            if (num2 % 7 == 0) {
                System.out.println("7의 배수");
            } else {
                if (num2 % 6 == 0) {
                    System.out.println("6의 배수");
                } else {
                    System.out.println("6, 7, 8의 배수가 아님");
                }
            }
        }

        int 키 = 140;
        int 나이 = 6;
        if (나이 >= 7 && 키 >= 140) {
            System.out.println("탑승 가능");
        }
        else {if (나이 < 7) {System.out.println("나이는 7세 이상이여야 합니다.");}
            else {System.out.println("키는 140cm 이상이여야 합니다.");}
            System.out.println("탑승 불가능");

        }
    }
}
