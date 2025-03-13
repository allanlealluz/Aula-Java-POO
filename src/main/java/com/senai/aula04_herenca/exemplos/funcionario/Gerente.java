package com.senai.aula04_herenca.exemplos.funcionario;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, Double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("nome: %s, salario R$%,.2f",getNome(),getSalario());
    }
}
