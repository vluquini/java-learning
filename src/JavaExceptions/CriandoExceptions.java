package JavaExceptions;

public class CriandoExceptions {
    public static void main(String[] args) {
        int num = 6;
        int denom = 4;

        try {
            if(num % denom != 0)
                throw new DivisaoNaoExataException(num, denom);
        }catch(Exception e) {
            System.out.println("Aconteceu um erro");
            e.printStackTrace();
        }finally {
            System.out.println("Resto da divisão: " + (num % denom));
        }

    }
}
