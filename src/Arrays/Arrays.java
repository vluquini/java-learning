package Arrays;

/*
 Diferença entre "String[] array" e "List<String> array":
 Um array de um tipo primitivo, como String ou int, tem tamanho fixo e imutável.
 Enquanto um array de uma interface, como List ou a implementação ArrayList, possui
 tamanho criado dinamicamente.

 Obs: array de interfaces, como ArrayList ou List só podem conter objetos.
 Ex: "ArrayList<int> inteiros = new ArrayList<>();" não funciona.

 Um array multidimensional, é apenas uma array de arrays.
 Ou seja, uma ArrayList multidimensional, é apenas uma ArrayList de ArrayList
        ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
        lists.add(new ArrayList<String>());

 Mas, já que a ArrayList não tem um tamanho limitado, qual é a utilidade de criar uma multidimensional?
 Talvez uma melhor opção, seria criar uma ArrayList de Arrays:
        ArrayList<String[]> arrays = new ArrayList<String[]>();
        arrays.add(new String[5]);
 */
public class Arrays {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0)
                System.out.println(x);
        }

        String[] aulas = {aula1, aula2, aula3};

        for (int i = 0; i < aulas.length; i++) {
            System.out.println(aulas[i]);
        }

        System.out.println("===============================");
        //Lê-se: para cada "aula" dentro de "aulas", faça (...)
        for (String aula : aulas) {
            System.out.println(aula);
        }

    }
}