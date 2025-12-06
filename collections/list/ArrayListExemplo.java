package br.com.edvalmor.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExemplo {
    public static void main(String[] args) {
        exemploSimpels();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();

    }

    private static void exemploNumeros() {
        System.out.println("**** exemploNumeros ***");
        List <Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(5);
        lista.add(784);
        lista.add(0);
        System.out.println("Lista sem ordenação: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
    }

    private static void exemploSimpels(){
        System.out.println("**** exemploListaSimples ****");
        List<String> lista = new ArrayList<>();
        lista.add("Eduarda Valmor");
        lista.add("João Matehus");
        lista.add("Denise");
        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploListaSimplesOrdemAscendente(){
        System.out.println("**** exemploListaSimplesOrdemAscendente ****");
        List<String> lista = new ArrayList<>();
        lista.add("Eduarda Valmor");
        lista.add("João Matehus");
        lista.add("Denise");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

}
