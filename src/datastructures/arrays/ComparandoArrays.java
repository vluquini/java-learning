package datastructures.arrays;

import java.util.Arrays;

public class ComparandoArrays {
    public static void main(String[] args) {

        int[] numbersA = new int[] {1,2,3};
        int[] numbersB = new int[] {1,2,3};

        numbersB[2] = 5;
        /*
           Como foi instanciado 2 objetos diferentes, o retorno da comparação será falso
           Obs: as duas comparações abaixo são pela referência, pois o método 'equals', da classe 'Object'
           compara pela referência na memória assim como o operador '=='.
           A maneira de mudar isso é sobreescrevendo o método 'equals' da classe 'Object'.
         */
        System.out.println(numbersA == numbersB);      // false
        System.out.println(numbersA.equals(numbersB)); // false

        numbersB = numbersA;

        System.out.println(numbersA == numbersB);      // true
        System.out.println(numbersA.equals(numbersB)); // true
        // Aqui eu mudo o valor do índice pela referência, logo, é alterado nos 2 arrays
        numbersB[2] = 5;

        System.out.println(Arrays.toString(numbersA)); // retorna o conteúdo de A
        System.out.println(Arrays.toString(numbersB)); // retorna o conteúdo de B

        // comparando os arrays pelo conteúdo
        int[] numbersC = new int[] {5,6,7};
        int[] numbersD = new int[] {5,6,7};

        System.out.println(Arrays.equals(numbersC,numbersD));

    }
}
