package estruturadedados.conjuntos;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        // Cria um TreeSet de strings
        TreeSet<String> frutas = new TreeSet<>();

        // Adiciona elementos ao TreeSet
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Pera");

        // Exibe os elementos do TreeSet em ordem natural
        System.out.println("Elementos do TreeSet (ordenados): " + frutas);

        // Verifica se um elemento está presente no TreeSet
        boolean contemLaranja = frutas.contains("Laranja");
        System.out.println("O TreeSet contém 'Laranja'? " + contemLaranja);

        // Remove um elemento do TreeSet
        frutas.remove("Banana");

        // Exibe os elementos do TreeSet após a remoção
        System.out.println("Elementos do TreeSet após a remoção: " + frutas);
    }
}

