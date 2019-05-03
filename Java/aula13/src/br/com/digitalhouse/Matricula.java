package br.com.digitalhouse;

import java.util.Date;

public class Matricula {
    private Aluno matriculaAluno;
    private Curso matriculaCurso;
    private Date matriculaData;

    public Matricula(Aluno matriculaAluno, Curso matriculaCurso, Date matriculaData) {
        this.matriculaAluno = matriculaAluno;
        this.matriculaCurso = matriculaCurso;
        this.matriculaData = new Date();
    }
}
