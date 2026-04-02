package study.ch10.Test;

public class Ex02 {
    static void main() {
        int [] nums = {85, 92, 78, 96, 88};
        int sum = 0;

        for (int i= 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
