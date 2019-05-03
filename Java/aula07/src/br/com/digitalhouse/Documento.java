package br.com.digitalhouse;

public class Documento implements Imprimivel {
    String nome;
    String tipo;

    public Documento(String nome, String tipo) {

        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie.");

    }
}

