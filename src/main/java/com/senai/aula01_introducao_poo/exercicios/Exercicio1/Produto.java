package com.senai.aula01_introducao_poo.exercicios.Exercicio1;

import java.util.Scanner;

public class Produto {
    String nome;
    float preco;
    int quantidade;
    Scanner scanner = new Scanner(System.in);

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        System.out.println("Produto "+nome+" custa "+preco+" e possui "+quantidade+ " itens");
    }
    public void atualizaEstoque (int valor){
        System.out.println("Vai acrescentar ou reduzir (S/N) ");
        String resp =  scanner.nextLine();
        if(resp.toLowerCase().equals("s")){
            quantidade += valor;
        }else if(resp.toLowerCase().equals("n")){
            quantidade -= valor;
        }else{
            System.out.println("Erro");
        }

        System.out.println("Agora possui o produto "+nome+" possui "+quantidade+ " itens");
    }
    public void calcularValorEstoque(){
        float sum = (float) preco * quantidade;
        System.out.println(sum);
    }
}
