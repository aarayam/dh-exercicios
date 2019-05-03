package br.com.digitalhouse;

import java.util.*;

public class Principal {
    public static void main(String[] args){

        //USANDO LIST

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa mayara = new Pessoa("Mayara", "Lima", 23); //inicializando
        Pessoa stephany = new Pessoa("Stephany", "Lima", 20);
        Pessoa henrique = new Pessoa("João Henrique", "Lima", 21);

        pessoas.add(mayara); //adicionando elementos na lista
        pessoas.add(stephany);
        pessoas.add(henrique);

/*        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }*/


        //USANDO SET:

        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(mayara);
        pessoaSet.add(stephany);
        pessoaSet.add(henrique);
        pessoaSet.add(mayara);

      /*  for (Pessoa pessoa : pessoaSet) {
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }*/



        //USANDO MAP:

        Map<String, Pessoa> pessoaMap = new HashMap<>();
        pessoaMap.put("mayara", mayara);
        pessoaMap.put("stephany", stephany);
        pessoaMap.put("henrique", henrique);
        pessoaMap.put("mayara", mayara);


      /*  for (String chave : pessoaMap.keySet()){
            System.out.println("Nome: " + pessoaMap.get(chave).getNome() +
                "\nSobrenome: " + pessoaMap.get(chave).getSobrenome() + "\n");
        }
*/


    }
}
