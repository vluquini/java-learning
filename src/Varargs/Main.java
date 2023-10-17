package Varargs;

/*
Utilizado quando nao se sabe quantos parâmetros serão
passados em um método.
Obs: se um método Varargs receber mais de um parâmetro, o
"varargs" deve ser o último.
 */
public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3};
        // Sem varargs
        System.out.println(soma(vetor));
        // Com varargs
        System.out.println(somaVarargs(1, 2, 3, 4, 5, 6));
    }

    static int soma(int[] vetor) {
        int total = 0;

        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }
        return total;
    }

    static int somaVarargs(Integer... valores) {
        int total = 0;

        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        return total;
    }

}