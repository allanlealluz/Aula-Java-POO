package com.senai.aula02_colecoes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(36,"Rafael");
        Pessoa pessoa2 = new Pessoa(17,"Toupeira");
        Pessoa pessoa3 = new Pessoa(19,"Gabriel");

        Pessoa[] matrizPessoas = new Pessoa[4];

        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for(Pessoa pessoa : matrizPessoas){
            System.out.println(pessoa);
        }
        matrizPessoas[0].falar("Dale");
        matrizPessoas[3] = new Pessoa(43,"Helena");
        System.out.println(matrizPessoas[3].nome);

        ArrayList lista = new ArrayList();

        lista.add(12);
        lista.add(true);
        lista.add("teste");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3);
        pessoa.falar("teste");

        ArrayList<Pessoa> listaPessoas = new ArrayList();

        listaPessoas.add(pessoa1);
        listaPessoas.add(new Pessoa(19, "Gabriel"));
    }
}