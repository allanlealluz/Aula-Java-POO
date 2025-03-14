package com.senai.aula04_herenca.exercicios.sistema_funcionarios;

public class Coordernador extends Funcionario{
    private String equipeProfessores;

    public Coordernador(String nome, double salario, String equipeProfessores) {
        super(nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    public String getEquipeProfessores() {
        return equipeProfessores;
    }

    public void setEquipeProfessores(String equipeProfessores) {
        this.equipeProfessores = equipeProfessores;
    }
}
