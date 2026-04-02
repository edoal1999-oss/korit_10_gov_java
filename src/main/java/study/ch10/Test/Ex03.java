package study.ch10.Test;

public class Ex03 {
    static void main() {
        int [] nums = {34, 78, 12, 56, 91, 23};
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                max = nums[i];
                continue;
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("최대값: " + max);
    }
}
