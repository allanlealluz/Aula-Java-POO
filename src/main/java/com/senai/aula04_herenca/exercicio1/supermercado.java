
package com.senai.aula04_herenca.exercicio1;

import java.time.LocalDate;

class produto {
    private String nome;
    private double preco;
    private int quantidade;

    public produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo() {
        System.out.println(" produto: " + nome);
        System.out.println(" Preço: R$ " + preco);
        System.out.println(" Quantidade em estoque: " + quantidade);
    }


    public void atualizarEstoque(int quantidadeVendida) {
        if (quantidadeVendida > 0 && quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.println("Venda realizada! Estoque atualizado.");
        } else {
            System.out.println(" Estoque insuficiente ou valor inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean vender(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade){
            this.quantidade -= quantidade;
            System.out.println("Venda realizada: " + quantidade + "unidades.");
            return true;
        }else{
            System.out.println("Etoque insuficiente ou quantidade inv[alida.");
            return  true;
        }
    }
}

class alimento extends produto {
    private LocalDate dataValidade;

    public alimento(String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade); // Chama o construtor da classe pai
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da classe pai
        System.out.println(" Data de validade: " + dataValidade);
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(dataValidade);
    }
}

class eletronico extends produto {
    private int voltagem;

    public eletronico(String nome, double preco, int quantidade, int voltagem) {
        super(nome, preco, quantidade);
        this.voltagem = voltagem;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Voltagem: " + voltagem + "V");
    }
}

public class supermercado {
    public static void main(String[] args) {

        alimento leite = new alimento("Leite Integral", 5.99, 50, LocalDate.of(2024, 4, 15));
        System.out.println(" produto Cadastrado: alimento");
        leite.exibirInfo();
        System.out.println(" O produto está vencido? " + (leite.estaVencido() ? "Sim" : "Não"));
        leite.atualizarEstoque(5);
        leite.exibirInfo();

        System.out.println("\n----------------------\n");

        eletronico celular = new eletronico("Smartphone", 2999.99, 10, 220);
        System.out.println(" produto Cadastrado: Eletrônico");
        celular.exibirInfo();
        celular.atualizarEstoque(2);
        celular.exibirInfo();
    }
}
