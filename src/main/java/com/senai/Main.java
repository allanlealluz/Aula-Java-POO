package com.senai;

import com.senai.aula01_introducao_poo.exemplos.pessoa.Endereco;
import com.senai.aula01_introducao_poo.exemplos.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Grajau","grauna do baile",12,"Sp");
        Pessoa pessoa1 = new Pessoa(endereco,1.8f,12,"Allan");
        pessoa1.comer("Pão");
        System.out.println(pessoa1);
    }
}
