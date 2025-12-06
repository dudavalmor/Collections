package br.com.edvalmor.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExemplo {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        List<String> lista = new LinkedList<>();
        lista.add("Sirius Black");
        lista.add("Hermione Granger");
        lista.add("Draco Malfoy");
        System.out.println(lista);
        System.out.println("");

        lista.remove(2);
        boolean contains1 = lista.contains("Draco Malfoy");
        boolean contains2 = lista.contains("Sirius Black");
        System.out.println("Lista após exclusão do index 2: " + lista);
        System.out.println(contains1);
        System.out.println(contains2);
        System.out.println("");

        for (String nome : lista) {
            System.out.println(nome);
        }

        System.out.println("");
        System.out.println("Elemento index 1: " + lista.get(1));
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("**** exemploListaSimplesOrdemAscendente ****");
        List<String> lista = new LinkedList<>();
        lista.add("Sirius Black");
        lista.add("Hermione Granger");
        lista.add("Draco Malfoy");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
