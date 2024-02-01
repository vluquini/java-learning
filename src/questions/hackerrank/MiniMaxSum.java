package questions.hackerrank;

import java.util.ArrayList;
import java.util.List;
/*
Descrição:
Dado um array com 5 elementos inteiros, mostre na tela
a maior e menor soma com 4 elementos deste array.
Obs: para evitar overflow com o tipo inteiro, é necessário
usar inteiro 64-bits.
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(null);
        long maxSum = 0;
        long minSum = 0;

        for (int i = 1; i < arr.size(); i++) {
            maxSum += arr.get(i);
            minSum += arr.get(i-1);
        }
        System.out.println(minSum + " " + maxSum);
    }

}
