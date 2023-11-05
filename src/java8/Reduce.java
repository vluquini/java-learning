package java8;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

/*
 * Operacao de Reduce - basicamente é pegar todos os elementos de um
 * stream e transformar em um só elemento.
 *
 * A funcao do reduce deve ser uma funcao ASSOCIATIVA. Ex:
 * 1 + 2 + 3 + 4 + 5 + 6 	   = 21
 * (1 + 2) + (3 + 4) + (5 + 6) = 21
 *
 * Soma e multiplicacao sao associativas. Subtracao nao é associativa.
 *
 * Originalmente, a operacao Reduce retorna um Optional, pois, se a Stream estiver vazia,
 * nao havera um resultado a ser retornado, e, portanto, o valor resultante seria nulo.
 */
public class Reduce {
    public static void main(String[] args) {

        String s = "Uma string grande para teste!";
        // "split()" divide uma string em substrings, com base em um determinado delimitador, retornando
        // um array de strings.
        String[] split = s.split(" ");

        List<String> listStr = Arrays.asList(split);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        // Sem utilizar optional:
        int resultado = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(resultado);

        // 1 + 2 + 3 + 4 + 5 + 6 	   = 21
        // (1 + 2) + (3 + 4) + (5 + 6) = 21
        // Reduce - soma
        Optional<Integer> soma = list.stream()
                .reduce((n1, n2) -> n1 + n2);

        System.out.println("Soma: " + soma.get());

        // Reduce - multiplicacao
        Optional<Integer> multiplicacao = list.stream()
                .reduce((n1, n2) -> n1 * n2);

        System.out.println("Multiplicacao: " + multiplicacao.get());

        // Reduce - concatenacao
        Optional<String> concatenacao = listStr.stream()
                .reduce((s1, s2) -> s1.concat(s2)); // ou s1 + s2 tambem funcionaria

        System.out.println("Concatenacao: " + concatenacao.get());

        // 1 - 2 - 3 - 4 - 5 - 6
        // Reduce - subtracao *NAO FAZER
        Optional<Integer> subtracao = list.stream()
                .reduce((n1, n2) -> n1 - n2);

        System.out.println("Susbtracao: " + subtracao.get());

    }
}
