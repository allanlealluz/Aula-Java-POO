package com.senai;

import com.senai.aula01_introducao_poo.exemplos.pessoa.Endereco;
import com.senai.aula01_introducao_poo.exemplos.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Endereco endereco = new Endereco();
        pessoa1.nome = "Allone";
        pessoa1.idade = 19;
        endereco.numeroCasa = 11;
        endereco.rua = "Padre Donizete";
        endereco.Cidade = "Embu Guaçu";
        endereco.bairro = "Jardim Campestre";
        pessoa1.endereco = endereco;
        pessoa1.endereco.EnderecoCompleto();
        pessoa1.comer("Pão");
    }
}
