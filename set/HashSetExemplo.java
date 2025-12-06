package br.com.edvalmor.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetExemplo {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploNovo();
    }

    private static void exemploNovo() {
        System.out.println("****** exemploNovo ******");
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(0);
        inteiros.add(4);
        inteiros.add(2);
        inteiros.add(1);
        inteiros.add(3);
        System.out.println(inteiros);
    }

    private static void exemploListaSimples(){
        System.out.println("****** exemploListaSimples ******");
        Set<String> lista = new HashSet<>();
        lista.add("Harry Potter");
        lista.add("Senhor dos Anéis");
        lista.add("Crônicas de Nárnia");
        lista.add("Crepúsculo");
        System.out.println(lista);
        System.out.println("");
    }

}
