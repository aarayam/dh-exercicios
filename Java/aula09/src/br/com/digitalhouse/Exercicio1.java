package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio1 {
    public static void main(String[] args) {
        //EXERCICIO 01

        Map<Integer, String> loteriaDosSonhos = new HashMap<>();
        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Água");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        for (int chave : loteriaDosSonhos.keySet()){
            System.out.println("Valor da loteria: " + loteriaDosSonhos.get(chave));
        }


        // part.2

        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        apelidos.put("joao", apelidosJoao);
        apelidos.put("miguel", apelidosMiguel);

//        for (String chave : apelidos.keySet()) {
//            System.out.println("Apelidos do: " + chave);
//            for (String apelido : apelidos.get(chave)){
//                System.out.println("\t" + apelido);
//            }
//        }
    }
}