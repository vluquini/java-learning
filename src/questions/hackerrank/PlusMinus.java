package questions.hackerrank;

import java.util.ArrayList;
import java.util.List;
/*
Descrição da questão:
A questão "plus minus" do HackerRank pede para calcular as proporções dos elementos de um array que são positivos,
negativos e zeros e imprimir esses valores com uma precisão específica.

Passo-a-passo:
1 - Ler o tamanho do array e os elementos do array.
2 - Inicialize contadores para o número de elementos positivos, negativos e zeros.
3 - Percorra o array e para cada elemento:
4 - Se for positivo, incremente o contador de positivos.
5 - Se for negativo, incremente o contador de negativos.
6 - Se for zero, incremente o contador de zeros.
Calcule as proporções dividindo o número de elementos positivos, negativos e zeros pelo tamanho total do array.
Imprima as proporções com uma precisão de seis casas decimais.
 */
public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        int arrSize = arr.size();
        int zeroCount = 0, positiveCount = 0, negativeCount = 0;

        for (int i = 0; i < arrSize; i++) {
            if (arr.get(i) < 0) negativeCount++;
            if (arr.get(i) == 0) zeroCount++;
            if (arr.get(i) > 0) positiveCount++;

        }
        double positiveRatio = (double) positiveCount / arrSize;
        double negativeRatio = (double) negativeCount / arrSize;
        double zeroRatio = (double) zeroCount / arrSize;

        System.out.printf("%.6f\n", positiveRatio);
        System.out.printf("%.6f\n", negativeRatio);
        System.out.printf("%.6f\n", zeroRatio);

    }

}
