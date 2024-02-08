package questions.hackerrank;

import java.util.*;

public class SparseArrays {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> queries = new ArrayList<>();

        strings.add("teste");
        strings.add("lua");
        strings.add("sol");

        queries.add("lua");
        queries.add("carro");

        System.out.println(matchingStrings(strings,queries));
        System.out.println(matchingStrings2(strings,queries));
    }
    // complexidade --> O(n+m)
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // chave/valor
        // mapa para contar as ocorrências das strings
        Map<String, Integer> countMap = new HashMap<>();

        // contagem das strings
        for (String s : strings) {
            // o método "gerOrDefault retorna o valor contido no map.
            // se não houver uma string 's', seu 'value' será 0. value aqui representa a qtd de vezes que a string se repete
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        // resultado das correspondências
        List<Integer> results = new ArrayList<>();
        for (String query : queries) {
            // se a string de consulta existir no mapa, adiciona sua contagem, caso contrário, adiciona 0.
            results.add(countMap.getOrDefault(query, 0));
        }

        return results;
    }
    // complexidade --> O(n^2)
    public static List<Integer> matchingStrings2(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            int temp = 0;
            for (int j = 0; j < strings.size(); j++) {
                if (queries.get(i).equals(strings.get(j))) {
                    temp++;
                }
            }
            result.add(temp);
        }
        return result;
    }
}
