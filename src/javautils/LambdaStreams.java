package javautils;

import java.util.List;
import java.util.Arrays;

/*
Referência: Canal RinaldoDev
 */
public class LambdaStreams {
    public static void main(String[] args) {

        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        // Assim seria até o Java 7
        for (Integer integer : asList) {
            System.out.print(integer + " ");
        }

        System.out.println();
        // Lê-se: para cada "elemento" nesta stream, faça...
        asList.stream().forEach(e -> System.out.println(e));

        System.out.println();
//		As expressoes Lambdas não servem apenas para economizar
//		linhas de código, mas para poder fazer o uso de múltiplas Streams..
//		Se o código abaixo não fosse em lambda + stream, seria muito mais poluído
//		As expressões Lambdas vieram para viabilizar a programação funcional, ou seja,
//		a programação baseada em funções.
        asList.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));

    }
}