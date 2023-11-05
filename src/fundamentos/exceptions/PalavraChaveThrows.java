package fundamentos.exceptions;

import java.util.Scanner;

// Throws: utilizado para passar o tratamento de exceção à classe que for utilizá-la
public class PalavraChaveThrows extends Exception {
    public static void main(String[] args) {
        System.out.println("Entre com um numero: ");
        try {
            double num = lerNumero();
            System.out.println("Você digitou " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }

    public static double lerNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        return num;
    }

}