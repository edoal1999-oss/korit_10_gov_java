package study.ch10.Test;

import java.util.Arrays;

public class Ex27 {
    static void main() {
        int [][] nums = new int [3][3];
        int [] rowSums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int num = j + 1;
                nums[i][j] = num + (i * nums[i].length);
            }
        }

        for (int i = 0; i< nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                rowSums[i] += nums[i][j] * 10;
            }
            System.out.println(Arrays.toString(rowSums));
        }
    }
}
