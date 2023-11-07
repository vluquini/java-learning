package estruturadedados.listas;

import java.util.ArrayList;
/*
Obs: Geralmente, é recomendado instanciar um objeto do tipo lista
da interface "List", pois pode ser necessário alterar o comportamento
deste objeto no futuro.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // Criação de um ArrayList de Strings
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");
        nomes.add("David");

        // Acessando elementos por índice
        String primeiroNome = nomes.get(0);
        System.out.println("Primeiro nome: " + primeiroNome);

        // Iteração através dos elementos
        System.out.println("Nomes na lista:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Verificando se um elemento está na lista
        String nomeProcurado = "Carol";
        if (nomes.contains(nomeProcurado)) {
            System.out.println(nomeProcurado + " está na lista.");
        }

        // Removendo um elemento da lista
        nomes.remove("David");
        System.out.println("Lista após remover David: " + nomes);

        // Verificando o tamanho da lista
        int tamanhoDaLista = nomes.size();
        System.out.println("Tamanho da lista: " + tamanhoDaLista);

        // Verificando se a lista está vazia
        boolean listaVazia = nomes.isEmpty();
        System.out.println("A lista está vazia? " + listaVazia);
    }
}
