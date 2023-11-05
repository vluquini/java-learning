package java8;

public class JavaNewSwitchCase {

    public static void main(String[] args) {
        String dia = "segunda";

        // Antigo switch case
        switch (dia) {
            case "segunda":
                System.out.println("Hoje é segunda-feira!");
                break;
            case "terça":
                System.out.println("Hoje é terça-feira!");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }

        /*
          Switch Case Arrow ou Lambda Like
          Funciona apenas se o 'CASE' tiver apenas 1 linha de código.
        */
        switch (dia) {
            case "segunda" 	-> System.out.println("Hoje é segunda-feira");
            case "terça" 	-> System.out.println("Hoje é terça-feira");
            default 		-> System.out.println("Dia inválido.");
        }
    }

}
