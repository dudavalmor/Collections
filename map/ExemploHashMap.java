package br.com.edvalmor.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploHashMap {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesIterandoValor();
        exemploListaSimplesIterandoChaves();
        exemploListaSimplesIterandoChaveValor();
    }

    private static void exemploListaSimplesIterandoChaveValor() {
        System.out.println("exemploListaSimplesIterandoChaveValor");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Eduarda Valmor");
        lista.put(2, "João Matheus");
        lista.put(3, "Denise Bueno");
        lista.put(4, "Bruna Oliveira");

        System.out.println("*for comum*");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : entry) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("*forEach stream*");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        });

        System.out.println("*forEach stream 1*");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("*forEach stream 2*");
        lista.values().stream().forEach(System.out::println);

        System.out.println("*forEach stream 3*");
        lista.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("*iterator*");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
        }
    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("exemploListaSimplesIterandoChaves");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Eduarda Valmor");
        lista.put(2, "João Matheus");
        lista.put(3, "Denise Bueno");
        lista.put(4, "Bruna Oliveira");

        for (Integer value : lista.keySet()){
            System.out.println(value);
        }
    }

    public static void exemploListaSimplesIterandoValor(){
        System.out.println("exemploListaSimplesIterandoValor");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Eduarda Valmor");
        lista.put(2, "João Matheus");
        lista.put(3, "Denise Bueno");
        lista.put(4, "Bruna Oliveira");

        System.out.println("for comum");
        for (String value : lista.values()) {
            System.out.println(value);
        }
    }

    public static void exemploListaSimples(){
        System.out.println("lista simples");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Eduarda Valmor");
        lista.put(2, "João Matheus");
        lista.put(3, "Denise Bueno");
        lista.put(4, "Bruna Oliveira");

        System.out.println(lista);
        System.out.println(" ");
    }
}
