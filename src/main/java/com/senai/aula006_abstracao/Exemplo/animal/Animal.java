package com.senai.aula006_abstracao.Exemplo.animal;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    abstract void fazerSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
