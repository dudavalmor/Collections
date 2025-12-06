package br.com.edvalmor.set;

import br.com.edvalmor.domain.Aluno;

import java.util.HashSet;
import java.util.Set;

public class HashSetAluno {
    public static void main(String[] args) {
     exemploListaSimplesAluno();
    }

    private static void exemploListaSimplesAluno() {
        Set<Aluno> alunos = new HashSet<>();

        Aluno a = new Aluno("Eduarda Valmor" , "Ciência da Computação", 10);
        Aluno b = new Aluno("João Matheus Dantas", "Relações Internacionais", 9.5);
        Aluno c = new Aluno("Bruna Oliveira", "Letras", 9.8);
        Aluno d = new Aluno("Bruna Oliveira", "Letras", 9.8);

        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        alunos.add(d);
        System.out.println(alunos);

        alunos.remove(c);
        System.out.println(alunos);

        for(Aluno aluno : alunos){
            System.out.println(alunos);
        }

    }
}
