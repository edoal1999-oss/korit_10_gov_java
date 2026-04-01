package study.ch10;

import java.util.Random;

public class Array06 {
    static void main() {
        int[] nums = new int[10];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100) + 1;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + ((i < nums.length - 2) ? "," : ""));
        }

        //nums에 저장된 랜덤한 숫자 중 최대값과 최소값을 각각 구하시오.
        int max = 0;
        int min = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];

            }
        }
            System.out.println("최대값: " + max);
            System.out.println("최소값: " + min);

    }
}
