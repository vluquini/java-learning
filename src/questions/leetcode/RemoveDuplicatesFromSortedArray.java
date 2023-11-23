package questions.leetcode;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        HashSet<Integer> diffs = new HashSet<>();
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            // O método 'add' retorna 'false' caso seja inserido um valor já existente no Set.
            if (diffs.add(nums[i])) {
                nums[k++] = nums[i];
            }
        }
        System.out.println(k);
    }
}
