package principal;

import java.util.List;

interface TarefaDAO {

    public void criar(Tarefa tarefa) throws Exception;
    public void criarColaborador(Colaborador colab, String id_tarefa) throws Exception;
    public void excluir(Tarefa tarefa) throws Exception;
    public void alterar(Tarefa tarefa) throws Exception;
    public void atribuirDependencia(Tarefa tarefa, Tarefa tarefaDep) throws Exception;
    public Boolean verificaColaboradores(Integer id_tarefa) throws Exception;
    public Integer retornaID() throws Exception;
    //Consultas
    public List<Tarefa> listaTodos() throws Exception;
    public List<Tarefa> listaTodosProjeto(String id_projeto) throws Exception;
    public List<Tarefa> listaAFazer() throws Exception;
    public List<Tarefa> listaFinalizadas() throws Exception;
    public List<Tarefa> listaPodeIniciar() throws Exception;
    public List<Tarefa> listaUnico(String id_tarefa) throws Exception;
    public List<Tarefa> listaTodosAtribuicao(Integer id_tarefa, Integer id_projeto) throws Exception;
    public List<Integer> listaTarefasDependentes(Integer id_tarefa) throws Exception;
    public List<Colaborador> listaColaboradores(String id_tarefa) throws Exception;
    
}
