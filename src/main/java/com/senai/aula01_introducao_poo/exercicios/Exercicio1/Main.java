package com.senai.aula01_introducao_poo.exercicios.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Leite",12.5f, 20);
        produto1.exibirDetalhes();
        produto1.atualizaEstoque(2);
        produto1.calcularValorEstoque();
        Produto produto2 = new Produto("Chocolate",7.5f,32);
        produto2.exibirDetalhes();
        produto2.atualizaEstoque(1);
        produto2.calcularValorEstoque();
    }
}
