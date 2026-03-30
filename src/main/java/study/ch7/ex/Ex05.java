package study.ch7.ex;

public class Ex05 {
    static void main() {
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("운전 가능");
        } else {
            System.out.println("운전 불가");
        }
    }
}

// 출력 결과: 운전 가능
