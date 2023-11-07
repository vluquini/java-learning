package threads.multithreads;
/*
Neste exemplo, criamos uma classe MyThread que estende a classe Thread e
substitui o método run(). Cada thread imprimirá uma contagem de 1 a 5.
No método main, criamos duas instâncias de MyThread e as iniciamos usando o método start().
Isso permitirá que as duas threads sejam executadas simultaneamente.

Observe que a saída exata pode variar, pois a ordem de execução das threads não é garantida.
Isso ilustra a natureza concorrente do multithreading em Java.
 */
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": Contagem " + i);
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}

