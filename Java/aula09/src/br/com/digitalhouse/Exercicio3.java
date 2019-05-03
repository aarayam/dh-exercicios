package br.com.digitalhouse;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        Set<Integer> conjuntoDeInteiros = new HashSet<>();

        conjuntoDeInteiros.add(4);
        conjuntoDeInteiros.add(6);

        for (int valor : conjuntoDeInteiros) {
            System.out.println(valor);
        }
    }
}
