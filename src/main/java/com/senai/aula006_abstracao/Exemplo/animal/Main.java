package com.senai.aula006_abstracao.Exemplo.animal;

public class Main {
    public static void main(String[] args) {
        testarAnimal(new Pato("Klebinho"));

    }
    public static void testarAnimal(Animal animal){
        animal.fazerSom();
    }
}
