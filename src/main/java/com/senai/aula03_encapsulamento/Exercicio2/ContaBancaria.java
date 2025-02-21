package com.senai.aula03_encapsulamento.Exercicio2;

public class ContaBancaria {
    String titular;
    double saldo;
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void Depositar(double valor){
        if(valor > 0){

        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
