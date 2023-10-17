package StaticImport;

/*
Importar métodos estaticos de uma classe, para economizar
a chamada da mesma, caso seja muito frequente...
 */
//import static java.lang.Math*; >> importa todos os metodos estáticos

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        double a = 2;
        double b = 4;

        System.out.println(Math.pow(a, b));
        System.out.println(Math.sqrt(b));
        // Após o import estático, fica assim o uso:
        System.out.println(pow(a, b));
        System.out.println(sqrt(b));
    }

}
