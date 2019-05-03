package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        //CURSOS
        Curso android = new Curso ("Mobile Android - muito massa");
        Curso fullstack = new Curso ("Web Fullstack - muito massa tbm");

        //ALUNOS
        Aluno jake = new Aluno(123, "Jake", "Peralta", fullstack );
        Aluno jacob = new Aluno(123456, "Jake", "Peralta", fullstack );
        Aluno amy = new Aluno(345, "Amy", "Santiago", fullstack);
        Aluno rosa = new Aluno(567, "Rosa", "Diaz", android );
        Aluno charles = new Aluno(789, "Charles", "Boyle", android );

        //LISTA DE ALUNOS
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(jake);
        //alunos.add(jacob);
        alunos.add(amy);
        alunos.add(rosa);
        alunos.add(charles);

        System.out.println(

                //imprimindo atraves do equals
                //jake.equals(jacob)

                //imprimindo atraves do contains
                //alunos.contains(jacob)

                //imprimindo atraves do toString
                jacob
        );

    }
}
