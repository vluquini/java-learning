package Java8Review;

/*
Referência: Canal RinaldoDev
 */
public class LambdaRunnable {
    public static void main(String[] args) {
        // Java 8 - Métodos Lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Ola mundo!");
            }
        }).start();// start ou run

        //Lambda
        new Thread(() -> System.out.println("Ola mundo!")).run();

        // SAM - Single Abstract Method
        // Qualquer INTERFACE que tenha apena um metodo abstrato.
        // @FuncionalInterface - uma anotação que obriga uma interface a possuir um único método abstrato.
    }
}