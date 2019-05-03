package br.com.digitalhouse;

public class professorAdjunto {
    private Professor professor;
    private int quantHorasMonitoria;

    public professorAdjunto(Professor professor, int quantHorasMonitoria) {
        this.professor = professor;
        this.quantHorasMonitoria = quantHorasMonitoria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getQuantHorasMonitoria() {
        return quantHorasMonitoria;
    }

    public void setQuantHorasMonitoria(int quantHorasMonitoria) {
        this.quantHorasMonitoria = quantHorasMonitoria;
    }
}
