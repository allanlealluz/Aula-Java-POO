package com.senai.aula01_introducao_poo.exemplos.concessionaria;

public class Carro {
    String marca;
    int ano;
    String modelo;
    float motor;
    float preco;

    public Carro(int ano, String marca, String modelo, float motor, float preco) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", ano=" + ano +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", preco=" + preco +
                '}';
    }
}
