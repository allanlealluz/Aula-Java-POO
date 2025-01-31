package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Pessoa {
    public String nome;
    public int idade;
    public float altura;
    public Endereco endereco;

    public void falar(String frase){
        System.out.println(frase);
    }

    public void comer(String alimento){System.out.println("Comendo "+alimento);}
}
