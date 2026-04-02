package study.ch10.Test;

import java.util.Arrays;

public class Ex08 {
    static void main() {
        int [] nums = {1, 2, 3, 4, 5};
        int [] reversedNums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            reversedNums[nums.length - 1 - i] = nums[i];
        }

        System.out.println(Arrays.toString(reversedNums));

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
