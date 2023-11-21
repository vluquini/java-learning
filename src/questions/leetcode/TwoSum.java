package questions.leetcode;

import java.util.HashMap;

/*
Questão: TwoSum
Fonte: LeetCode
Nível: Fácil

Descrição:
Dada uma matriz de números inteiros e um alvo inteiro, retorne os índices dos dois números
de forma que eles somem ao alvo. Você pode assumir que cada entrada teria exatamente uma solução
e não pode usar o mesmo elemento duas vezes. Você pode retornar a resposta em qualquer ordem.

Exemplo 1:
Entrada: nums = [2,7,11,15], alvo = 9 Saída: [0,1]
Explicação: Como nums[0] + nums[1] == 9, retornamos [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] numeros = {2, 7, 11, 15};
        int target = 9;

        twoSum(numeros, target);
        twoSumHashMap(numeros, target);
    }
    // Complexidade: O(N^2)
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    // Complexidade: O(N)
    public static int[] twoSumHashMap(int[] nums, int target) {
        // Criando um HashMap para armazenar os números e seus índices
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Verificando se o complemento já está no HashMap
            if (map.containsKey(complement)) {
                // Se encontrado, retorna os índices dos dois números
                return new int[]{map.get(complement), i};
            }
            // Caso contrário, coloca o número atual no HashMap
            map.put(nums[i], i);
        }
        // Se nenhum par é encontrado, retorna null
        return null;
    }
}
