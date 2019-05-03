package br.com.digitalhouse;

import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Curso> cursos;
    private List<Matricula> matriculas;

    public void registrarCurso(String nomeCurso, Integer codigoCurso,
                               Integer quantMaximaDeAlunos) {

    }

    public void excluirCurso(Integer codigoCurso) {

    }

    public void registrarProfessorAdjunto(String nomeProfessorAdjunto, String sobrenomeProfessorAdjunto, Integer codigoProfessor, int quantHorasMonitoria) {

    }

    public void registrarProfessorTitular(String nomeProfessorTitular, String sobrenomeProfessorTitular, Integer codigoProfessor, String especialidade) {

    }

    public void excluirProfessor(Integer codigoProfessor) {

    }

    public void registrarAluno(String nomeAluno, String sobrenomeAluno, Integer codigoAluno) {

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {

    }

    public void alocarProfessor(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

    }
}


