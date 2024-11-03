package com.org.raphaelprojects.taskger;

import java.util.ArrayList;


public class Gerenciador {
    private ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

    public void addTarefa(Tarefa tarefa){

        listaDeTarefas.add(tarefa);

    }

    public ArrayList<Tarefa> getTarefas(){

        if (listaDeTarefas.isEmpty()){

            System.out.println("Está lista está bem vazia.");
        }

        return listaDeTarefas;

    }

    public void concluirTarefa(int indice){

        if (indice >= 0 && indice < listaDeTarefas.size()){

            Tarefa tarefa = listaDeTarefas.get(indice);
            tarefa.setConcluida(true);
            System.out.println("Tarefa " + tarefa.getNomeTarefa() + " concluida ");
            listaDeTarefas.remove(indice);
        }

        else if (listaDeTarefas.isEmpty()) {

            System.out.print("Oba ! nenhuma tarefa para concluir.");

        }

        else {

            System.out.println("índice inválido");

        }

    }
}



