package estruturadedados.listas;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Criação de um LinkedList de Inteiros
        LinkedList<Integer> numeros = new LinkedList<>();

        // Adicionando elementos ao LinkedList
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        // Acessando elementos por índice
        int primeiroNumero = numeros.get(0);
        System.out.println("Primeiro número: " + primeiroNumero);

        // Iteração através dos elementos
        System.out.println("Números na lista:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Verificando se um elemento está na lista
        int numeroProcurado = 3;
        if (numeros.contains(numeroProcurado)) {
            System.out.println(numeroProcurado + " está na lista.");
        }

        // Removendo um elemento da lista
        numeros.removeFirst();
        System.out.println("Lista após remover o primeiro número: " + numeros);

        // Verificando o tamanho da lista
        int tamanhoDaLista = numeros.size();
        System.out.println("Tamanho da lista: " + tamanhoDaLista);

        // Verificando se a lista está vazia
        boolean listaVazia = numeros.isEmpty();
        System.out.println("A lista está vazia? " + listaVazia);

    }
}
