package javautils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Streams em Java são uma maneira de processar coleções de elementos de forma
 * mais fácil e concisa. Eles permitem que você execute operações em coleções
 * de elementos, como filtrar, classificar, mapear, agrupar e reduzir, de maneira
 * eficiente e com menos código.
 * ===============================================================================
 * São divididas em operações intermediárias e finais:
 * forEach é uma operação final/terminal, ou seja, após ele não pode ser chamado
 * mais nenhum método.
 * Já as operações intermediárias são "filtros", que podem ser utilizado varias vezes.
 */
public class JavaStreams {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 2, 5, 6, 2, 6, 7, 8, 9, 10, 11, 12);
//    	Operacoes intermediarias
//    	lista.stream()
//    	.filter(e -> e % 2 == 0)
//    	.distinct() // equals e hashcode
//    	.map(e -> e * 2) // a lista original nao e alterada
//    	.forEach(e -> System.out.print(e + " "));
//
//    	System.out.println("\n" + lista);
//
//    	Operacoes finais
//    	long count = lista.stream()
//    	.distinct() // remove os repetidos da lista
//    	.filter(e -> e % 2 == 0)
//    	.count();
//
//    	System.out.println(count);

        Optional<Integer> count2 = lista.stream()
                .filter(e -> e % 2 == 0)
                // depois do metodo "min" é possível chamar outros métodos
                // mas apenas os que pertencem a classe "Comparator", e nao à stream.
                .min(Comparator.naturalOrder());

        System.out.println(count2.get());

        List<Integer> novaLista = lista.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 3)
                .collect(Collectors.toList()); // armazena o resultado da stream na lista "novaLista".

        System.out.println(novaLista);
    }

}