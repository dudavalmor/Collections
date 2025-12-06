package br.com.edvalmor.map;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        exemploListaSimples();
    }

    public static void exemploListaSimples(){
        System.out.println("exemploListaSimples");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(4, "Bruna");
        lista.put(2, "João Matheus");
        lista.put(3, "Denise");
        lista.put(1, "Eduarda");

        System.out.println(lista);
        System.out.println(" ");
    }
}
