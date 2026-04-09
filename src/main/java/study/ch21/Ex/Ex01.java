package study.ch21.Ex;

public class Ex01 {
    static void main() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
            System.out.println("정상 실행");
        } catch (Exception e) {
            System.out.println("오류가 발생했습니다" + e.getMessage());
        }
        System.out.println("프로그램 종료");
    }
}
