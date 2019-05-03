package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private int codigoCurso;
    private int quantMaximaAlunos;
    private professorTitular profTitular;
    private professorAdjunto profAdjunto;
    private List<Aluno> alunos;

    public class listaALunos {
        public List<Aluno> listaDeAlunos = new ArrayList<>();
    }

    public Curso(String nomeCurso, int codigoCurso, int quantMaximaAlunos) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.profTitular = profTitular;
        this.profAdjunto = profAdjunto;
        this.quantMaximaAlunos = quantMaximaAlunos;
        this.alunos = alunos;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public professorTitular getProfTitular() {
        return profTitular;
    }

    public void setProfTitular(professorTitular profTitular) {
        this.profTitular = profTitular;
    }

    public professorAdjunto getProfAdjunto() {
        return profAdjunto;
    }

    public void setProfAdjunto(professorAdjunto profAdjunto) {
        this.profAdjunto = profAdjunto;
    }

    public int getQuantMaximaAlunos() {
        return quantMaximaAlunos;
    }

    public void setQuantMaximaAlunos(int quantMaximaAlunos) {
        this.quantMaximaAlunos = quantMaximaAlunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarUmAluno(Aluno umAluno) {
        System.out.println("Aluno adicionado!");
    }

    public void excluirUmAluno(Aluno umAluno) {
        System.out.println("Aluno excluido!");
    }

}

