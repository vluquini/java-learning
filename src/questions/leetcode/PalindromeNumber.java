package questions.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 123;

        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome2(x));
        System.out.println(isPalindrome3(x));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        int reversed = 0;
        int original = x;

        while (original != 0) {
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }
        return reversed == x;
    }

    public static boolean isPalindrome2(int x) {
        String s = String.valueOf(x); // converte para string
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            // comparamos as posições iniciais com as finais
            // se forem diferentes, retornamos false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        // se forem iguais, retornamos true
        return true;
    }

    public static boolean isPalindrome3(int x) {
        String value = String.valueOf(x);
        StringBuilder sb = new StringBuilder(value);

        return sb.reverse().toString().equals(value);
    }
}
