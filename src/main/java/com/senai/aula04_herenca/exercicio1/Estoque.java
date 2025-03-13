package com.senai.aula04_herenca.exercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe Pai (produto)
class Produto {
    private String nome;
    private double preco;
    protected int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Adiciona produtos ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Adicionado " + quantidade + " unidades de " + nome + " ao estoque.");
        } else {
            System.out.println(" Quantidade inválida.");
        }
    }

    //  Vende um produto (reduz estoque)
    public boolean vender(int quantidadeVendida) {
        if (quantidadeVendida > 0 && quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.println(" Venda realizada: " + quantidadeVendida + " unidades de " + nome);
            return true;
        } else {
            System.out.println(" Estoque insuficiente ou valor inválido.");
            return false;
        }
    }

    // Exibe detalhes do produto
    public void exibirInfo() {
        System.out.println("produto: " + nome);
        System.out.println(" Preço: R$ " + preco);
        System.out.println(" Estoque: " + quantidade + " unidades");
    }

    public String getNome() {
        return nome;
    }
}

//  Subclasse alimento
class Alimento extends produto {
    private LocalDate dataValidade;

    public Alimento(String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println(" Data de validade: " + dataValidade);
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(dataValidade);
    }
}

// Subclasse eletronico
class Eletronico extends produto {
    private int voltagem;

    public Eletronico(String nome, double preco, int quantidade, int voltagem) {
        super(nome, preco, quantidade);
        this.voltagem = voltagem;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("⚡ Voltagem: " + voltagem + "V");
    }
}

// Classe de Gerenciamento de Estoque
class Estoque {
    private List<produto> produtos = new ArrayList<>();

    // Adiciona um produto ao estoque
    public void adicionarProduto(produto produto) {
        produtos.add(produto);
        System.out.println(" produto " + produto.getNome() + " adicionado ao estoque!");
    }

    //  Lista todos os produtos
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println(" Nenhum produto no estoque.");
        } else {
            System.out.println("\nProdutos no Estoque:");
            for (produto p : produtos) {
                p.exibirInfo();
                System.out.println("---------------------");
            }
        }
    }

    //  Vende um produto pelo nome
    public boolean venderProduto(String nome, int quantidade) {
        for (produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.vender(quantidade);
                return false;
            }
        }
        System.out.println(" produto não encontrado.");
        return false;
    }
}

//  Classe Principal (Menu do supermercado)
class Supermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        int opcao;
        do {
            System.out.println("""
                    
                    MENU - SISTEMA DE ESTOQUE
                    ---------------------------------
                    1️⃣  Adicionar alimento
                    2️⃣  Adicionar Eletrônico
                    3️⃣  Listar Produtos
                    4️⃣  Vender produto
                    5️⃣  Sair
                    ---------------------------------
                    Escolha uma opção:""");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1 -> { // Adicionar alimento
                    System.out.print("Nome do alimento: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: R$ ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Ano de Validade: ");
                    int ano = scanner.nextInt();
                    System.out.print("Mês de Validade: ");
                    int mes = scanner.nextInt();
                    System.out.print("Dia de Validade: ");
                    int dia = scanner.nextInt();
                    LocalDate validade = LocalDate.of(ano, mes, dia);

                    estoque.adicionarProduto(new alimento(nome, preco, quantidade, validade));
                }
                case 2 -> { // Adicionar Eletrônico
                    System.out.print("Nome do Eletrônico: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: R$ ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Voltagem (110 ou 220): ");
                    int voltagem = scanner.nextInt();

                    estoque.adicionarProduto(new eletronico(nome, preco, quantidade, voltagem));
                }
                case 3 -> estoque.listarProdutos(); // Listar Produtos
                case 4 -> { // Vender produto
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade a vender: ");
                    int qtd = scanner.nextInt();

                    boolean sucesso = estoque.venderProduto(nome, qtd);
                    if (sucesso){
                        System.out.println("Venda concluida!!");
                    }else{
                        System.out.println("Venda não realizada.Verifique o estoque");
                    }
                }
                case 5 -> System.out.println(" Saindo do sistema...");
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
