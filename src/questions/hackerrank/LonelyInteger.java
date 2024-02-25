package questions.hackerrank;

import java.util.*;
/*
Objetivo: encontrar o único valor n que não se repete na lista.
 */
public class LonelyInteger {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(
                Arrays.asList(2, 2, 1, 3, 3, 5, 1)
        );

        System.out.println(lonelyInteger(arr));
        System.out.println(lonelyInteger2(arr));
        System.out.println(lonelyInteger3(arr));

    }

    public static int lonelyInteger(List<Integer> a) {
        int lonelyInteger = 0;
        for (int num : a) {
            // utilizando o operador de atribuição bit-a-bit "XOR"
            // este operador compara os valores de x e y. se forem iguais
            // retorna 0, caso contrário, 1
            lonelyInteger ^= num;
        }
        return lonelyInteger;
    }
    // utilizando stream para aplicar a função "XOR"
    public static int lonelyInteger2(List<Integer> a){
        return a.stream()
                .reduce(0, (x, y) -> x ^ y);
    }
    // utilizando map
    public static int lonelyInteger3(List<Integer> a){
        Map<Integer, Integer> countMap = new HashMap<>();

        for(Integer i : a){
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

}
