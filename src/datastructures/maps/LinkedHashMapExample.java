package datastructures.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new LinkedHashMap<>();

        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);
        map1.put("four", 4);
        // criando um novo LinkedHashMap com base em um anterior
        Map<String, Integer> map2 = new LinkedHashMap<>(map1);
        // utilizando o método 'putAll', que faz o mesmo, e adicionando um elemento
        Map<String, Integer> map3 = new LinkedHashMap<>();
        map3.put("five", 5);
        map3.putAll(map1);

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);

        // Usando o método 'merge'
        Map<String, Integer> map4 = new LinkedHashMap<>();

        map4.put("six", 6);
        map4.put("seven", 7);
        map4.put("eight", 8);

        System.out.println("Mapa original: " + map4);
        // se a key 'six' existir no mapa, multiplica pelo value 3, caso contrário, cria e adiciona o value 3.
        map4.merge("six", 3, (oldValue, newValue) -> oldValue * newValue);

        System.out.println("Mapa após o merge: " + map4);

    }
}
