package com.senai.aula03_encapsulamento.Exercicio2;

public class ContaBancaria {
    String titular;
    double saldo;
    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }
    public void Depositar(double valor){
        if(valor > 0){
            setSaldo(saldo + valor);
        }
    }
    public void sacar(double valor){
        if(valor <= getSaldo()){
            setSaldo(saldo - valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        if(saldo > 0) {
            this.saldo = saldo;
        }else{
            System.out.println("Saldo negativo");
            throw new IllegalArgumentException("Errro de negativo");
        }
    }
}
