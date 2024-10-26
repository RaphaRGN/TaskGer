package com.org.raphaelprojects.taskger;

public class Tarefa {

    public int prioridade;
    public String nomeTarefa;
    public String descricao;
    public boolean concluida;

    public int getPrioridade() {

        return prioridade;
    }

    public void setPrioridade(int prioridade) {

        this.prioridade = prioridade;
    }

    public String getNomeTarefa() {

        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {

        this.nomeTarefa = nomeTarefa;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public boolean isConcluida() {

        return concluida;
    }

    public void setConcluida(boolean concluida) {

        this.concluida = concluida;
    }

    public Tarefa (int prioridade, String nomeTarefa, String descricao, boolean concluida){

        this.prioridade = prioridade;
        this.nomeTarefa = nomeTarefa;
        this.descricao = descricao;
        this.concluida = concluida;

    }

    public String toString(){

        return "Tarefa: " + descricao;

    }
}


