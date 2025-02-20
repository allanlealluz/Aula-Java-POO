package com.senai.aula02_colecoes.Exercicios;

import java.util.Scanner;

public class geren_tarefa {
    public static void main(String[] args) {
        boolean value = true;
        tarefa tarefa = new tarefa();
        while(value == true) {
            System.out.println("Gerenciador de Tarefas ");
            System.out.println("Digite 1 para adicionar, ");
            System.out.println("Digite 2 para listar");
            System.out.println("Digite 3 para sair \n");
            Scanner scanner = new Scanner(System.in);
            int opt = scanner.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Qual o nome da tarefa? ");
                    tarefa.adicionarTarefa(scanner.next());
                    break;
                case 2:
                    System.out.println("Listando tarefas ");
                    tarefa.listarTarefas();
                    break;
                case 3:
                    System.out.println("Fechando sistema");
                    value = false;
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }
}
