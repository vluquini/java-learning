package questions;

public class ReverseString {
    public static void main(String[] args) {
        String teste = "Zaraki Kenpachi";

        System.out.println(reverseString1(teste));
        System.out.println(reverseString2(teste));
        System.out.println(reverseString3(teste));
        System.out.println(reverseString4(teste));
        System.out.println(reverseString5(teste));
    }
    // utilizando o método swap --> O(n/2)
    public static String reverseString1(String s){
        var last = s.length() - 1;
        var charArray = s.toCharArray();

        for (int i = 0; i < s.length() / 2; i++) {
            charArray[i] = s.charAt(last-i);
            charArray[last -  i] = s.charAt(i);
        }
        return String.valueOf(charArray);
    }

    // utilizando método swap com uma variável auxiliar
    public static String reverseString2(String s){
        var charArray = s.toCharArray();
        char temp;
        int right = charArray.length - 1;

        for (int i = 0; i < charArray.length / 2; i++) {
            temp = charArray[right];
            charArray[right] = charArray[i];
            charArray[i] = temp;
            right--;
        }
        return String.valueOf(charArray);
    }

    public static String reverseString3(String s){
        StringBuilder reverse = new StringBuilder();
        int tam = s.length() - 1;
        // também é possível começar o loop diretamente do final
        for (int i = 0; i < s.length(); i++) {
            reverse.append(s.charAt(tam));
            tam--;
        }
        return reverse.toString();
    }

    public static String reverseString4(String s){
        var sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String reverseString5(String s){
//      Esta solução não é boa em performance, pois a cada
//      concatenação é criado um novo objeto de string. Pra melhorar isso,
//      é mais interessante usar o StringBuilder, pois é mutável.
        String reversed = "";
        int tam = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            reversed = reversed.concat(String.valueOf(s.charAt(tam)));
//          System.out.println("String: " + reversed + ", Código Hash: " + System.identityHashCode(reversed));
            tam--;
        }
        return reversed;
    }

}
