package br.com.edvalmor.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploLinkedHashMap {
    public static void main(String[] args) {
        exemploListaSimpkes();
    }

    public static void exemploListaSimpkes(){
        System.out.println("exemploListaSimples");
        Map<Integer, String> lista = new LinkedHashMap<>();
        lista.put(4, "Bruna");
        lista.put(2, "João Matheus");
        lista.put(3, "Denise");
        lista.put(1, "Eduarda");

        System.out.println(lista);
        System.out.println(" ");
    }
}
