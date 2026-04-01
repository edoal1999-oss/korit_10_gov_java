package study.ch10;

public class Array08 {
    static void main() {
        int [] nums = {10, 20, 30, 40, 50};

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }

        for (int num : nums) {
            System.out.println(num);
        }

        for (int i = 0; i< nums.length; i++){
            nums[i] = nums[i] * 100 ; {
                System.out.println(nums[i]);
            }
        }

        String[] names = {"노푸른", "노연두", "노주황"};

        for (int i = 0; i < names.length; i++) {
            String name= names[i];
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
