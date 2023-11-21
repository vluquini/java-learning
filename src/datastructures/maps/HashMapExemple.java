package datastructures.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExemple {

    public static void main(String[] args) {
        // Criar um HashMap para armazenar contatos
        Map<String, String> contatos = new HashMap<>();

        // Adicionar contatos
        contatos.put("Alice", "123-456-7890");
        contatos.put("Bob", "987-654-3210");
        contatos.put("Charlie", "555-555-5555");

        // Exibir todos os contatos
        System.out.println("Contatos:");
        for (Map.Entry<String, String> entry : contatos.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefone: " + entry.getValue());
        }

        // Verificar se um contato existe
        String nomeProcurado = "Bob";
        if (contatos.containsKey(nomeProcurado)) {
            System.out.println(nomeProcurado + " está na lista de contatos. Número: " + contatos.get(nomeProcurado));
        } else {
            System.out.println(nomeProcurado + " não está na lista de contatos.");
        }

        // Remover um contato
        String nomeRemovido = "Charlie";
        contatos.remove(nomeRemovido);

        // Exibir a lista de contatos após a remoção
        System.out.println("Lista de contatos após a remoção de " + nomeRemovido + ": " + contatos);
    }
}

