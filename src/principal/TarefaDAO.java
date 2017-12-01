package principal;

import java.util.List;

interface TarefaDAO {

    public void criar(Tarefa tarefa) throws Exception;
    public void excluir(Tarefa tarefa) throws Exception;
    public void alterar(Tarefa tarefa) throws Exception;
    public void atribuirDependencia(Tarefa tarefa, Tarefa tarefaDep) throws Exception;
    public Integer retornaID() throws Exception;
    public List<Tarefa> listaTodos() throws Exception;
    public List<Tarefa> listaTodosAtribuicao(Tarefa tarefa) throws Exception;
    public List<Integer> listaTarefasDependentes(Integer id_tarefa) throws Exception;
    public List<Colaborador> listaColaboradores(Integer id_tarefa) throws Exception;
    
}
