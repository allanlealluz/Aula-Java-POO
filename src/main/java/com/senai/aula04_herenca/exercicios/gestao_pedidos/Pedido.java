package com.senai.aula04_herenca.exercicios.gestao_pedidos;

public class Pedido {
    private int numeroPedido;
    private double valorPedido;

    public Pedido(int numeroPedido, double valorPedido) {
        this.numeroPedido = numeroPedido;
        this.valorPedido = valorPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }
}
