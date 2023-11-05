package threads.exemplo1;

public class Main {
    public static void main(String[] args) {
        // Cria duas instâncias de Thread e atribui uma tarefa a cada uma
        Thread thread1 = new Thread(new MinhaTarefa("Thread 1"));
        Thread thread2 = new Thread(new MinhaTarefa("Thread 2"));

        // Inicia as threads
        thread1.start();
        thread2.start();
    }

    // Classe que implementa a tarefa a ser executada por cada thread
    static class MinhaTarefa implements Runnable {
        private final String nome;

        public MinhaTarefa(String nome) {
            this.nome = nome;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(nome + ": Contagem " + i);
                try {
                    Thread.sleep(1000); // Pausa por 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
