package com.org.raphaelprojects.taskger;

import java.util.ArrayList;


public class Gerenciador {
    private ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa){

        listaDeTarefas.add(tarefa);

    }
}


