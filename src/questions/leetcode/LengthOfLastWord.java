package questions.leetcode;
//size of the largest word in the string

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Today is a nice day";

        System.out.println(lengthOfLastWord1(s));
        System.out.println(lengthOfLastWord2(s));
        System.out.println(lengthOfLastWord3(s));
    }

    public static int lengthOfLastWord1(String s) {
        if (s == null || s.isEmpty()) return 0;
        int wordSize = 0, i = s.length() - 1;
        // aspas 'simples' para comparação de caracteres, 'duplas' são usadas para strings
        while (i >= 0 && s.charAt(i) == ' ') i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            wordSize++;
            i--;
        }
        return wordSize;
    }

    public static int lengthOfLastWord2(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
    }

    public static int lengthOfLastWord3(String s) {
        // "trim" remove espaços em branco no inicio e final da string.
        String[] arr = s.trim().split(" ");
        int last = arr.length;
        return arr[last-1].length();
    }

}
