package ListadeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefaSet.add(tarefa);
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemovida = null;
        for (Tarefa t: tarefaSet){
            if (t.getDescricao().equals(descricao)){
                tarefaRemovida = t;
                break;
            }
        }
        tarefaSet.remove(tarefaRemovida);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa f: tarefaSet){
            if (f.isConcluido() == true){
                tarefasConcluidas.add(f);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa f: tarefaSet){
            if (f.isConcluido() == false){
                tarefasPendentes.add(f);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa f: tarefaSet){
            if (f.getDescricao().equals(descricao)){
                f.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa f: tarefaSet){
            if (f.getDescricao().equals(descricao)){
                f.setConcluido(false);
            }
        }
    }

    public void limparListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }


}
