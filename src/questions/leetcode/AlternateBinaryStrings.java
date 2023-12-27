package questions.leetcode;

public class AlternateBinaryStrings {
    public static void main(String[] args) {
        String s = "10010100";

        System.out.println(minOperations(s));
        System.out.println(minOperations2(s));
    }
    public static int minOperations(String s) {
        int swaps = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
                swaps += s.charAt(i) == '0' ? 0 : 1;
            else
                swaps += s.charAt(i) == '1' ? 0 : 1;
        }
        return Math.min(swaps, s.length() - swaps);
    }

    public static int minOperations2(String s) {
        int countForAlternate0 = 0;
        int countForAlternate1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    countForAlternate1++;
                } else {
                    countForAlternate0++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    countForAlternate1++;
                } else {
                    countForAlternate0++;
                }
            }
        }
        return Math.min(countForAlternate0, countForAlternate1);
    }

}
