package com.org.raphaelprojects.taskger;
import java.util.Scanner;


public class sessaoprincipal {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("""
                Bem vindo ao TaskGer !
                Seu App confiável de gerenciamento de tarefas!
                Digite uma das opções abaixo:
                1- Adicionar uma tarefa
                2- Concluir uma tarefa
                3- Ver tarefas ativas""");

        int escolhaInterface = scanner.nextInt();

        switch (escolhaInterface){

            case 1:

                System.out.println("Digite a prioridade da sua tarefa: ");
                int prioridade = scanner.nextInt();

                System.out.println("Digite o título da sua tarefa: ");
                String nomeTarefa = scanner.next();

                System.out.println("Por fim, digite um breve resumo de sua tarefa: ");
                String descricao = scanner.next();


        }



    }
}
