package com.senai.aula03_encapsulamento;

public class Funcionarios {
    String nome;
    double salario;
    String cargo;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if(salario > 1.320){
            this.salario = salario;
        }else{
            throw new IllegalArgumentException("O salario deve superar R$1.320,00");
        }

    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
