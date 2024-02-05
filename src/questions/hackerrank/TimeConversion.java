package questions.hackerrank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "07:05:45PM";
        System.out.println(timeConversion(s));
        System.out.println(timeConversion2(s));
    }

    public static String timeConversion(String s){
        String start = s.substring(0,2);
        String end = s.substring(2,8);
        int hour = Integer.parseInt(start);

        if (s.contains("P") && hour < 12) {
            hour += 12;
            start = String.valueOf(hour);
        }
        if (s.contains("A") && hour == 12) {
            start = "00";
        }
        s = start + end;
        return s;
    }

    public static String timeConversion2(String s) {
        // define o formato da entrada do tipo 0-12h
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("hh:mm:ssa");
        // define o formato de saída do tipo 0-24h
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        // faz o parsing da hora de entrada
        LocalTime time = LocalTime.parse(s, inputFormat);
        // formata a hora de acordo com o formato de saída
        return time.format(outputFormat);
    }
}
