package study.ch10.Test;

import java.util.Arrays;

public class Ex26 {
    static void main() {
        int[][] nums = new int [3][3];

        //3x3 행렬을 1~9로 채워라
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int num = j + 1;
                nums [i][j] = num + (i * nums[i].length);
            }

        }
        for (int i = 0; i< nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
        
    }
}
