package questions.leetcode;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = new int[]{2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums){
        int zeros = 0, ones = 0;

        for (int num : nums) {
            if (num == 0) zeros++;
            if (num == 1) ones++;
        }
        for(int i = 0; i < zeros; i++){
            nums[i] = 0;
        }
        for(int i = zeros; i < ones + zeros; i++){
            nums[i] = 1;
        }
        for(int i = ones + zeros; i < nums.length; i++){
            nums[i] = 2;
        }
    }
}