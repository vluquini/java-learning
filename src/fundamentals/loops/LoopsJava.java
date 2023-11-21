package fundamentals.loops;

public class LoopsJava {
    public static void main(String[] args) {
        int contador = 0;

        // Loop - while
        while (contador < 5) {
            System.out.println("Iteração A: " + contador);
            contador++;
        }

        // Loop - for
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteração B: " + i);
        }

        // Loop for-Each (Iterando em um Array):
        String[] cores = {"vermelho", "verde", "azul"};
        for (String cor : cores) {
            System.out.println("Cor: " + cor);
        }

        // Loop do-while:
        int numero = 0;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero < 5);

    }
}
