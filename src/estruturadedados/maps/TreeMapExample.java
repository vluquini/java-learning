package estruturadedados.maps;

import java.util.TreeMap;
/*
Obs: Geralmente, é recomendado instanciar um objeto do tipo mapa
da interface "Map", pois pode ser necessário alterar o comportamento
deste objeto no futuro.
 */
public class TreeMapExample {
    public static void main(String[] args) {
        // Criação de um TreeMap com chave (String) e valor (Integer)
        TreeMap<String, Integer> notas = new TreeMap<>();

        // Adicionando elementos ao TreeMap
        notas.put("Alice", 95);
        notas.put("Bob", 85);
        notas.put("Carol", 90);
        notas.put("David", 88);

        // Acessando elementos por chave
        int notaAlice = notas.get("Alice");
        System.out.println("Nota de Alice: " + notaAlice);

        // Iteração através dos elementos
        System.out.println("Notas na lista:");
        for (String aluno : notas.keySet()) {
            int nota = notas.get(aluno);
            System.out.println(aluno + ": " + nota);
        }

        // Verificando se uma chave está no TreeMap
        String alunoProcurado = "Carol";
        if (notas.containsKey(alunoProcurado)) {
            int notaCarol = notas.get(alunoProcurado);
            System.out.println(alunoProcurado + " tem nota " + notaCarol);
        }

        // Removendo um elemento do TreeMap
        notas.remove("David");
        System.out.println("Notas após remover David: " + notas);

        // Verificando o tamanho do TreeMap
        int tamanhoDoMapa = notas.size();
        System.out.println("Tamanho do mapa: " + tamanhoDoMapa);

        // Verificando se o TreeMap está vazio
        boolean mapaVazio = notas.isEmpty();
        System.out.println("O mapa está vazio? " + mapaVazio);
    }
}
