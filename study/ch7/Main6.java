package study.ch7;

import java.util.Scanner;

public class Main6 {
    static void main() {
        int searchNumber = 6;
        int foundIndex = -1;
        for (int i = 0; i < 10; i++){
            int num = i + 1;
            if (num == searchNumber){
                foundIndex = i;
                break;
            }
        }
        System.out.println("검색 번호:" + searchNumber);
        System.out.println("찾은 Index:" + foundIndex);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("프로그램을 정지하시려면 close를 입력해주시오.(계속 사용하시려면 아무거나 입력 후 엔터.:");
            if (sc.nextLine().equals("close")){
                break;
            }
            System.out.println("프로그램 실행 중...");
        }

    }
}
