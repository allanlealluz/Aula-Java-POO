package com.senai.aula04_herenca.exercicios.gestao_pedidos;

public class PedidoPresencial extends Pedido {
    private double descontoAvista;

    public PedidoPresencial(int numeroPedido, double valorPedido, double descontoAvista) {
        super(numeroPedido, valorPedido);
        this.descontoAvista = descontoAvista;
    }

    public double getDescontoAvista() {
        return descontoAvista;
    }

    public void setDescontoAvista(double descontoAvista) {
        this.descontoAvista = descontoAvista;
    }
}
