package com.senai.aula04_herenca.exemplos.gerenciamentocontabancaria;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contacorrente1 = new ContaCorrente("Allone Kyoto",150000,200000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Bryan laines",1200,2);


        System.out.println(contaPoupanca.getSaldo());
        System.out.println(contacorrente1.getSaldo());
        System.out.println("\n_____tentando sacar 1520____\n");
        if(contaPoupanca.sacar(1520)){
            System.out.println("saque realizado");
        }
        if(contacorrente1.sacar(1520)){
            System.out.println("saque realizado");
        }
        System.out.println("\n____Aplicando investimento _____\n");
        contaPoupanca.aplicarRendimento();
        System.out.println(contaPoupanca.getSaldo());
    }
}
