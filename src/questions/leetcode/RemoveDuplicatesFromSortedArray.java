package questions.leetcode;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(nums.length);
        System.out.println(removeDuplicates(nums));
        System.out.println(nums.length);

//        System.out.println(removeDuplicates2(nums));
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (seen.add(nums[i])) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static int removeDuplicates2(int[] nums) {
//        int i = 0;
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}
