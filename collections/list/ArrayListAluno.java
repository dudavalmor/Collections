package br.com.edvalmor.collections.list;

import br.com.edvalmor.domain.Aluno;
import br.com.edvalmor.domain.CompararNota;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAluno {
    public static void main(String[] args) {
        exemploListaSimplesClasseExterna();
        listaComparatorAluno();
    }

    private static void exemploListaSimplesClasseExterna(){
        System.out.println("**** exemploListaSimplesClasseExterna ****");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("Eduarda Valmor" , "Ciência da Computação", 0d);
        Aluno b = new Aluno("João Matheus Dantas", "Relações Internacionais", 0f);
        Aluno c = new Aluno("Bruna Oliveira", "Letras", 0f);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista alunos sem ordenação: " + lista);
        System.out.println("");
        Collections.sort(lista);
        System.out.println("Lista com ordenação: " + lista);
        System.out.println("");
    }

    public static void listaComparatorAluno() {
        System.out.println("**** listaComparatorAluno ****");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("Eduarda Valmor" , "Ciência da Computação", 10);
        Aluno b = new Aluno("João Matheus Dantas", "Relações Internacionais", 9.5);
        Aluno c = new Aluno("Bruna Oliveira", "Letras", 9.8);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista alunos sem ordenação: " + lista);
        System.out.println("");
        Collections.sort(lista);
        System.out.println("Lista com ordenação por nome: " + lista);
        System.out.println("");

        CompararNota compararNota = new CompararNota();
        Collections.sort(lista, compararNota);
        System.out.println("Lista com ordenação por nota: " + lista);
    }


}
