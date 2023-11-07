package threads.sincronizacao;
/*
Neste exemplo, temos uma classe SharedResource com um método printNumbers(), que é
sincronizado usando a palavra-chave synchronized. Duas instâncias da classe MyThread
compartilham a mesma instância de SharedResource. Quando essas duas threads chamam o
método printNumbers(), a sincronização garante que apenas uma thread de cada vez pode
executar esse método.

Isso é importante para evitar condições de corrida e garantir que as threads acessem
recursos compartilhados de forma segura e consistente. Cada thread imprime números de 1 a 5,
e a pausa com Thread.sleep(100) demonstra como as threads são sincronizadas e aguardam
sua vez de executar a seção crítica.
 */
class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    SharedResource resource;

    MyThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.printNumbers();
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        MyThread thread1 = new MyThread(resource);
        MyThread thread2 = new MyThread(resource);

        thread1.start();
        thread2.start();
    }
}

