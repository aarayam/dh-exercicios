package br.com.digitalhouse;

public class Pessoa {
    private String nome;
    private int rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public Pessoa(){

    }

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    @Override
    public boolean equals(Object outraPessoa) {
        if (!(outraPessoa instanceof Pessoa)) {
            return false;
        }
        if (((Pessoa) outraPessoa).getRg()== (this.getRg())) {
            return true;

        }
        return false;
    }
    }


