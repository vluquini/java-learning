package questions.leetcode;

public class InversedString {
    public static void main(String[] args) {
        String teste = "Não desistir é o caminho!!";
        String reversed = "";
        int tam = teste.length() - 1;

        for (int i = 0; i < teste.length(); i++) {
            reversed = reversed.concat(String.valueOf(teste.charAt(tam)));
            tam--;
        }
        System.out.println(reversed);
    }
}
