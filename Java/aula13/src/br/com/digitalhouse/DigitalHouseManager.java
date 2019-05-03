package br.com.digitalhouse;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    public List<Curso> listaDeCursos = new ArrayList<>();


    public void registrarCurso(Curso cadastroCurso, String nomeCurso, Integer codigoCurso, Integer quantMaximaDeAlunos) {
        listaDeCursos.add(cadastroCurso);
        System.out.println("Curso cadastrado com sucesso");
    }


    public void excluir(Integer excluirCurso) {
        for (Curso curso : listaDeCursos) {
            if (curso.getCodigoCurso() == excluirCurso) {
                listaDeCursos.remove(curso);

            } else {
                System.out.println("Erro ao excluir curso, tente novamente.");
            }
        }
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


