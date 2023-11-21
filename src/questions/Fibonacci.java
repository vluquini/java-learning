package questions;

public class Fibonacci {
    public static void main(String[] args) {
        int sequence = 10;
        int primeiro = 0, segundo = 1;

        for(int i = 0; i < sequence; i++){
            System.out.println(primeiro);
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

    }
}
