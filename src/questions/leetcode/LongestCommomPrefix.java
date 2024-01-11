package questions.leetcode;

import java.util.Arrays;

public class LongestCommomPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

//        Arrays.stream(strs).forEach(System.out::println);
        System.out.println(longestCommonPrefix2(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int index = 0;

        while(index < s1.length() && index < s2.length()){
            if(s1.charAt(index) == s2.charAt(index)){
                index++;
            } else break;

        }
        return s1.substring(0, index);
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

}
