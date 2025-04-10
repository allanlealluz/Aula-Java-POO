package com.senai.aula006_abstracao.Exercicios.SistemaPagamentos;

interface MetodoPagamento {
    double calcularTaxa(double valor);
    void realizarPagamento(double valor, ContaBanco conta);
}

