package br.com.edvalmor.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExemplo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Lover");
        queue.add("The Life of a Showgirl");
        queue.add("Reputation");
        System.out.println(queue);
        System.out.println("");
        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }

        System.out.println("");
        System.out.println(queue);
    }
}
