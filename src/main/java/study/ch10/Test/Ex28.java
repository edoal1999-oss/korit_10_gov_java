package study.ch10.Test;

import java.util.Arrays;

public class Ex28 {
    static void main() {
        int [][] nums = new int [3][3];
        int [] colSums = new int[nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int num = j + 1;
                nums [i][j] = num + (i * nums[i].length);
            }

        }

        for (int i = 0; i< nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                colSums[j] += nums[i][j] * 10;
            }
        }

        System.out.println(Arrays.toString(colSums));

    }
}
