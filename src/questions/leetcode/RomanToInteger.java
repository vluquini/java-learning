package questions.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
        System.out.println(romanToInt2(s));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int result = 0;

        for(int i = 0; i < s.length(); i++){
            if(i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
                result -= map.get(s.charAt(i));
            else
                result += map.get(s.charAt(i));
        }
        return result;
    }

    public static int romanToInt2(String s) {
        int result = 0, num = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I'-> num = 1;
                case 'V'-> num = 5;
                case 'X'-> num = 10;
                case 'L'-> num = 50;
                case 'C'-> num = 100;
                case 'D'-> num = 500;
                case 'M'-> num = 1000;
            }
            if (4 * num < result) result -= num;
            else result += num;
        }
        return result;
    }

}
