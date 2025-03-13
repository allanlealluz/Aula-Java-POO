package com.senai.aula04_herenca.exemplos.gerenciamentocontabancaria;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (saldo+limite) && (valor > 0)){
            setSaldo(saldo - valor);
            return true;
        }else{
            return false;
        }
    }
}
