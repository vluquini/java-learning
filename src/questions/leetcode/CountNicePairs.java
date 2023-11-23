package questions.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountNicePairs {
    public static void main(String[] args) {
        int[] nums = {13,10,35,24,76};
        int pairs = 0;
        int mod = 1000000007;

        // Map para rastrear a contagem de valores após a subtração do valor invertido
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            int diff = num - reversed(num);
            countMap.put(diff, countMap.getOrDefault(diff, 0) + 1);
        }

        for (int count : countMap.values()) {
            // Casting para evitar possível perda de precisão
            long longCount = (long) count;

            // Se houver k pares de um determinado valor diff, a contribuição para o total será k * (k - 1) / 2
            pairs = (int) ((pairs + longCount * (longCount - 1) / 2) % mod);
        }
        System.out.println(pairs);
    }

    private static int reversed(int num) {
        int reversedNum = 0;
        while (num > 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }
        return reversedNum;
    }
}
