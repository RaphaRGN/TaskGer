package com.org.raphaelprojects.taskger;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class sessaoprincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerenciador Gerenciador = new Gerenciador();




        boolean continuar = true;

        while (continuar) {

            System.out.println("""
                Bem vindo ao TaskGer !
                Seu App confiável de gerenciamento de tarefas!
                Digite uma das opções abaixo:
                1- Adicionar uma tarefa
                2- Concluir uma tarefa
                3- Ver tarefas ativas""");

            int escolhaInterface = scanner.nextInt();

            switch (escolhaInterface) {

                case 1:

                    System.out.println("Digite a prioridade da sua tarefa: ");
                    int prioridade = scanner.nextInt();

                    System.out.println("Digite o título da sua tarefa: ");
                    String nomeTarefa = scanner.next();

                    System.out.println("Por fim, digite um breve resumo de sua tarefa: ");
                    String descricao = scanner.next();
                    boolean concluida = false;



                    Tarefa novaTarefa = new Tarefa(prioridade, nomeTarefa, descricao, concluida);
                    Gerenciador.addTarefa(novaTarefa);

                    System.out.println("Tarefa adicionada com sucesso !");
                    break;


                case 2:

                    if (Gerenciador.getTarefas().isEmpty()){

                        System.out.println("Oba ! nenhuma tarefa pendente");

                    }
                   else {
                        System.out.println("Selecione uma das tarefas");

                        for (int i = 0; i < Gerenciador.getTarefas().size() ; i++){

                            System.out.println(i + "-" +Gerenciador.getTarefas());

                        }
                        break;
                    }
            }
        }
    }
}