package com.senai.aula006_abstracao.Exemplo.animal;

public class Pato extends Animal{
    public Pato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println("O pato faz: Quack quack quack");
    }
    void botarOvo(){
        System.out.println(getNome()+" virou mamãe!! ");
    }
}
