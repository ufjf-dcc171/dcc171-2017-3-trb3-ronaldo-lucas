package principal;

import java.util.List;

interface TarefaDAO {

    public void criar(Tarefa prod) throws Exception;
    public List<Tarefa> listaTodos() throws Exception;
}
