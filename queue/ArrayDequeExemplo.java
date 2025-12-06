package br.com.edvalmor.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExemplo {
    public static void main(String[] args) {
        acessandoDaFila();
        removerDaFila();
        inserindoNaFila();
    }

    public static void acessandoDaFila() {
        System.out.println("******Removendo******");
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Taylor Swift");
        deque.add("Fearless");
        deque.add("Speak Now");
        deque.add("Red");
        deque.add("1989");
        deque.add("Reputation");

        Deque<String> ad = new ArrayDeque<>();
        ad.add("Lover");
        ad.add("Folklore");
        ad.add("Evermore");
        ad.add("Midnights");
        ad.add("TTPD");
        ad.add("TLOASG");

        System.out.println(deque);
        System.out.println(ad);
        deque.addAll(ad);
        System.out.println(deque);

        System.out.println(deque.contains("TTPD"));
        System.out.println(ad.contains("Taylor Swift"));
        System.out.println(ad.containsAll(ad));

        System.out.println("Outuput of element: " + deque.element());
        System.out.println("Get first element using getFirst: " + deque.getFirst());
        System.out.println("Get last element using getLast: " + deque.getLast());
        System.out.println("Output of peek: " + deque.peek());
        System.out.println("Get first element using peekFirst: " + deque.peekFirst());
        System.out.println("Get last element using peekLast: " + deque.peekLast());
        System.out.println("");

    }

    private static void removerDaFila() {
        System.out.println("******ACESSANDO******");
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Taylor Swift");
        deque.add("Fearless");
        deque.add("Speak Now");
        deque.add("Red");
        deque.add("1989");
        deque.add("Reputation");

        Deque<String> ad = new ArrayDeque<>();
        ad.add("Lover");
        ad.add("Folklore");
        ad.add("Evermore");
        ad.add("Midnights");
        ad.add("TTPD");
        ad.add("TLOASG");

        deque.addAll(ad);
        System.out.println("Elements in the ArrayDeque: " + deque);

        String removed = deque.remove();
        deque.remove("Lover");

        System.out.println("Elements in the ArrayDeque after remove: " + deque);
        System.out.println("");
        System.out.println(removed);

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Elements in the ArrayDeque after removeFirst e removeLast: " + deque);

        deque.removeAll(deque);
        System.out.println("Elements in the ArrayDeque after removeAll: " + deque);

    }

    private static void inserindoNaFila() {
        System.out.println("***** INSERINDO *****");

        Deque<String> d = new ArrayDeque<String>();
        d.add("Delhi");
        d.addFirst("Bangalore");
        d.addLast("Chennai");

        System.out.println("Elements in the Deque after add, addFirst and addLast: " + d);

        Deque<String> dq = new ArrayDeque<String>();
        dq.add("Hyderabad");
        dq.add("Trivandrum");

        d.addAll(dq);

        System.out.println("Elements in the Deque after addAll: " + d);

        boolean val = d.offer("Jaipur");
        d.offerFirst("Goa");
        d.offerLast("Mumbai");

        System.out.println("Elements in the Deque after offer, offerFirst and offerLast: " + d);

        d.push("Kolkata");

        System.out.println("Elements in the Deque after push: " + d);
        System.out.println("");
    }
}
