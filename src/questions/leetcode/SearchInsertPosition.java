package questions.leetcode;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;

        System.out.println(searchInsert(nums, target));
        System.out.println(searchInsert2(nums, target));
        System.out.println(searchInsert3(nums, target));

    }

    public static int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int l = 0;
        int r = n - 1;

        while(l < r){
            int m = l + (r - l)/2;

            if(nums[m] == target) return m;
            else if(nums[m] > target) r = m; // right could be the result
            else l = m + 1; // m + 1 could be the result
        }

        // 1 element left at the end
        // post-processing
        return nums[l] < target ? l + 1: l;
    }

    public static int searchInsert2(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }

    public static int searchInsert3(int[] arr, int target) {
        int index = Arrays.binarySearch(arr,target);
        return index<0 ? -(index+1) : index;
    }

}
