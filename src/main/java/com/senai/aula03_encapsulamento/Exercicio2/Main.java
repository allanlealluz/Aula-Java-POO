package com.senai.aula03_encapsulamento.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria  = new ContaBancaria("Allan",15000);
        Scanner scanner = new Scanner(System.in);
        int opt = 0;
        while(opt != 3){
            System.out.println("Sistema bancário.\n");
            System.out.println("Digite 1 para depositar, 2 para sacar e 3 para sair do sistema");
            opt = scanner.nextInt();
            switch(opt){
                case 1:
                    System.out.println("Você escolheu deposito, digite o valor que seja depositar");
                    contaBancaria.Depositar(scanner.nextDouble());
                    System.out.println("Agora você possui "+contaBancaria.getSaldo()+" reais");
                    break;
                case 2:
                    System.out.println("Você escolheu sacar, digite o valor que seja sacado");
                    contaBancaria.sacar(scanner.nextDouble());
                    System.out.println("Agora você possui "+contaBancaria.getSaldo()+" reais");
                    break;
                case 3:
                    System.out.println("SAINDO");
                    break;
                default:
                    System.out.println("Opção invalida");


            }
        }
    }

}
