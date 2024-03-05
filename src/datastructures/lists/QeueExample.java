package datastructures.lists;

import java.util.PriorityQueue;
import java.util.Queue;

public class QeueExample {
    public static void main(String[] args) {
        Queue<Integer> fila = new PriorityQueue<>();

        fila.add(10);
        fila.add(20);
        fila.add(30);

        System.out.println(fila);
        System.out.println(fila.size());
        // retorna, mas não remove, o elemento no topo da fila, ou seja, o primeiro
        System.out.println(fila.peek());
        // retorna e remove o elemento no topo da fila
        System.out.println(fila.poll());
        System.out.println(fila);

    }
}
