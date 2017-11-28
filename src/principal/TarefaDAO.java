package principal;

import java.util.List;

interface TarefaDAO {

    public void criar(Tarefa tarefa) throws Exception;
    public void excluir(Tarefa tarefa) throws Exception;
    public void alterar(Tarefa tarefa) throws Exception;
    public Integer retornaID() throws Exception;
    public List<Tarefa> listaTodos() throws Exception;
    
}
