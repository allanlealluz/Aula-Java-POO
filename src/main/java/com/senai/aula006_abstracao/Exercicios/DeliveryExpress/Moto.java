package com.senai.aula006_abstracao.Exercicios.DeliveryExpress;

public class Moto extends Veiculo {
    public Moto(int velocidadeAtual, double cargaMaxima, double distanciaDestino) {
        super(velocidadeAtual, cargaMaxima, distanciaDestino);
    }

    @Override
    public double calcularTempoEntrega() {
        return distanciaDestino / (double) velocidadeAtual;
    }

    @Override
    public int getVelocidadeMaxima() {
        return 100;
    }
}
