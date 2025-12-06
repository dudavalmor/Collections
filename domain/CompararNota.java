package br.com.edvalmor.domain;

import java.util.Comparator;

public class CompararNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o2.getNota(), o1.getNota());
    }
}
