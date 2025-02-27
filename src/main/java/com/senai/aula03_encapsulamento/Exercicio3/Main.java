package com.senai.aula03_encapsulamento.Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionarios> funcionario = new ArrayList<>();
        ArrayList<String> cargos_possiveis = new ArrayList<>();
        cargos_possiveis.add("Gerente");
        cargos_possiveis.add("Analista");
        cargos_possiveis.add("Programador");

        int opt = 0;
        while(opt != 4){
            System.out.println("Sistema de cadastro de novos funcionários");
            System.out.println("Escolha uma opção" +
                    "1 - Cadastrar funcionário" +
                    "2 - Aumentar salario" +
                    "3 - exibir funcionarios" +
                    "4 - sair");
            opt = scanner.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Digite o nome do funcionário ");
                    String nome = scanner.next();
                    System.out.println("Digite o salario dele: ");
                    scanner.nextLine();
                    double salario = scanner.nextDouble();
                    System.out.println("Qual o cargo dele");
                    String cargo = scanner.next();
                    funcionario.add(new Funcionarios(nome,salario,cargo,cargos_possiveis));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    throw new IllegalArgumentException("Opção invalida");
            }
        }
    }


}
