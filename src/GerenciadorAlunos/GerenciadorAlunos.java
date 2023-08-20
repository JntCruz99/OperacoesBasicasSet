package GerenciadorAlunos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(matricula,nome, media));
    }

    public void removerAluno(long matricula){
        Aluno aluno = null;
        for (Aluno a: alunoSet){
            if (a.getMatricula().equals(matricula)){
                aluno = a;
            }
        }
        alunoSet.remove(aluno);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunos = new TreeSet<>(alunoSet);
        return alunos;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunos = new TreeSet<>(new ComparatorPorPreco());
        alunoSet.addAll(alunoSet);
        return alunos;
    }

}

