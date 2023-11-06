package estruturadedados.conjuntos;

import java.util.HashSet;

public class ExemploHashSet {

    public static void main(String[] args) {
        // Cria um HashSet de números inteiros
        HashSet<Integer> numeros = new HashSet<>();

        // Adiciona elementos ao HashSet
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        // Exibe os elementos do HashSet
        System.out.println("Elementos do HashSet: " + numeros);

        // Verifica se um elemento está presente no HashSet
        boolean contemNumero20 = numeros.contains(20);
        System.out.println("O HashSet contém o número 20? " + contemNumero20);

        // Remove um elemento do HashSet
        numeros.remove(30);

        // Exibe os elementos do HashSet após a remoção
        System.out.println("Elementos do HashSet após a remoção: " + numeros);
    }
}

