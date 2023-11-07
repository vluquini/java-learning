package estruturadedados.listas;

import java.util.ArrayList;
import java.util.List;

public class ManipulandoListas {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = new ArrayList<>();

        // Adicionar elementos à lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Exibir os elementos da lista
        System.out.println("Elementos da lista:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Verificar o tamanho da lista
        int tamanho = numeros.size();
        System.out.println("Tamanho da lista: " + tamanho);

        // Verificar se a lista contém um elemento específico
        boolean contemNumero30 = numeros.contains(30);
        System.out.println("A lista contém o número 30? " + contemNumero30);

        // Remover um elemento da lista
        numeros.remove(2); // Remove o elemento na posição 2 (30)

        // Exibir a lista após a remoção
        System.out.println("Elementos da lista após a remoção:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
