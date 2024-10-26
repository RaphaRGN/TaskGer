package com.org.raphaelprojects.taskger;
import java.util.*;


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
                \n1- Adicionar uma tarefa
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
                    Gerenciador.getTarefas().sort(Comparator.comparingInt(Tarefa::getPrioridade));
                    break;

                case 2:

                    if (Gerenciador.getTarefas().isEmpty()){

                        System.out.println("Oba ! nenhuma tarefa pendente");

                    }
                   else {
                        System.out.println("Selecione uma das tarefas para concluir: ");
                        ArrayList<Tarefa> tarefas = Gerenciador.getTarefas();
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + " - " + tarefas.get(i));
                        }

                        int indice = scanner.nextInt();
                        Gerenciador.concluirTarefa(indice);
                    }
                        break;

                   case 3:
                        System.out.println("Cheque as tarefas abaixo: ");
                        System.out.println(Gerenciador.getTarefas());
                         break;
            }
        }
    }
}