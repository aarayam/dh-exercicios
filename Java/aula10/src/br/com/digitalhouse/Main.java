package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoa maria = new Pessoa("Maria", 1234567);
        Pessoa ana = new Pessoa("Ana", 1234567);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(maria);
        pessoas.add(ana);

        System.out.println(
                maria.equals(ana)
        );
    }
}
