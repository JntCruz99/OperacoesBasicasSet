package ListadeTarefas;

public class Main {

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        Tarefa tarefa = new Tarefa("limpar casa", true);
        Tarefa tarefa1 = new Tarefa("comer", false);
        Tarefa tarefa2 = new Tarefa("estudar", true);
        Tarefa tarefa3 = new Tarefa("pagar boletos", false);
        listaTarefas.adicionarTarefa(tarefa);
        listaTarefas.adicionarTarefa(tarefa1);
        listaTarefas.adicionarTarefa(tarefa2);
        listaTarefas.adicionarTarefa(tarefa3);

        listaTarefas.removerTarefa("comer");
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}
