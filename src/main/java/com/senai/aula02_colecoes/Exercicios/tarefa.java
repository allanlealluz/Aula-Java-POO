package com.senai.aula02_colecoes.Exercicios;

import java.util.ArrayList;

public class tarefa {
    String Tarefa;
    boolean Realizado;
    ArrayList Tarefas = new ArrayList();

    public void adicionarTarefa(String tarefa) {
        this.Tarefas.add(tarefa);
    }
    public void listarTarefas() {
        Tarefas.forEach(System.out::println);
    }

}
