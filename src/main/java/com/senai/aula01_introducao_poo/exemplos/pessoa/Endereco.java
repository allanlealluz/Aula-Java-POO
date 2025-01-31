package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Endereco {
    public String rua;
    public String bairro;
    public int numeroCasa;
    public String Cidade;

    public void EnderecoCompleto(){
        System.out.println(rua+" "+numeroCasa+" "+bairro+ " "+Cidade);
    }
}
