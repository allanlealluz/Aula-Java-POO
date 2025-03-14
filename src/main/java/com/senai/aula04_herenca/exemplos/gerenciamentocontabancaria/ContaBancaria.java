package com.senai.aula04_herenca.exemplos.gerenciamentocontabancaria;

public class ContaBancaria {
    String titular;
    protected double saldo;
    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        this.saldo = saldo;
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

    public void Depositar(double valor){
        if(valor > 0){
            this.saldo = saldo + valor;
        }
    }
    public boolean sacar(double valor){
        if(valor <= saldo && valor > 0){
            this.saldo = saldo - valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
//    public void transferir(double valor, contadestino){
//        if(this.sacar(valor)) {
//            contadestino.Depositar(valor);
//        }
//    }

}

