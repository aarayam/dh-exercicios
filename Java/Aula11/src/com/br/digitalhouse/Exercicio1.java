package com.br.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {


        List<String> valores = new ArrayList<>();

        valores.add("Pato");
        valores.add("Cachorro");
        valores.add("Gato");

        try {
            valores.get(3);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException");
        }
    }
}
