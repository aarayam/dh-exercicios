package br.com.digitalhouse;

public class professorTitular {
    private Professor professor;
    private String especialidade;

    public professorTitular(Professor professor, String especialidade) {
        this.professor = professor;
        this.especialidade = especialidade;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
