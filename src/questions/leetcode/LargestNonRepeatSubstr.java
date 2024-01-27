package questions.leetcode;

import java.util.*;

// question: Longest Substring Without Repeating Characters
public class LargestNonRepeatSubstr {
    public static void main(String[] args) {
        String s =  "testetestetestettesterabcdef";
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;

        for (int left = 0, right = 0; right < s.length(); ) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                max = Math.max(max, set.size());
            } else
                set.remove(s.charAt(left++));
        }
        return max;
    }

}
