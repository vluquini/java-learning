package estruturadedados.arrays;

import java.util.ArrayList;

public class AcessandoArrays2D {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();

        carros.add("Celta");
        carros.add("Fusca");
        carros.add("Camaro");

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Hamburger");
        foods.add("Pizza");
        foods.add("Lasanha");

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Suco");
        drinks.add("Coca-Cola");
        drinks.add("Pepsi");

        ArrayList<ArrayList<String>> itens = new ArrayList<>();
        itens.add(carros);
        itens.add(foods);
        itens.add(drinks);

        // Acessando cada elemento dentro do array maior
        // Com variavel auxiliar, para fazilicar o entendimento
        for (int i = 0; i < itens.size(); i++) {
            for (int j = 0; j < itens.get(i).size(); j++) {
                String item = itens.get(i).get(j);
                for (int k = 0; k < item.length(); k++) {
                    char letra = item.charAt(k);
                    System.out.print(letra + " ");
                }
                System.out.println("\n--------------");
            }
            System.out.println("==================");
        }

        // Sem uso de variavel auxiliar
        for (int i = 0; i < itens.size(); i++) {
            for (int j = 0; j < itens.get(i).size(); j++) {
                for (int k = 0; k < itens.get(i).get(j).length(); k++) {
                    System.out.print(itens.get(i).get(j).charAt(k) + " ");
                }
                System.out.println("\n---------------");
            }
            System.out.println("============");
        }

    }
}
