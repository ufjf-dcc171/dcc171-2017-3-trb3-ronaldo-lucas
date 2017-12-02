package principal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAOJDBC implements TarefaDAO{

    private final Connection conexao;
    private final PreparedStatement comandoInsere;
    private final PreparedStatement comandoExclui;
    private final PreparedStatement comandoAltera;
    private final PreparedStatement comandoListarTodos;
    private final PreparedStatement comandoListarDependentes;
    private final PreparedStatement comandoListarColaboradores;
    private final PreparedStatement comandoSeleciona;
    private final PreparedStatement comandoAtribuiDependencia;
    private final PreparedStatement comandoListarAtribuiDependencia;
    private final PreparedStatement comandoInsereColaborador;
    private final PreparedStatement comandoVerificaColaboradores;

    public TarefaDAOJDBC() throws Exception {
        conexao = ConexaoJavaDB.getConnection();
        comandoInsere = conexao.prepareStatement("Insert Into TAREFAS(id, id_projeto, descricao, dt_inicio, dt_fim, status) VALUES (?,?,?,?,?,?)");
        comandoInsereColaborador = conexao.prepareStatement("Insert Into TAREFA_COLABORADOR(ID_COLABORADOR, ID_TAREFA) VALUES (?,?)");
        comandoExclui = conexao.prepareStatement("Delete From TAREFAS Where ID = ?");
        comandoAltera = conexao.prepareStatement("Update TAREFAS set descricao = ?, dt_inicio = ?, dt_fim = ? where id = ?");
        comandoListarTodos = conexao.prepareStatement("SELECT id_projeto, id, descricao, dt_inicio, dt_fim, status FROM TAREFAS");
        comandoListarDependentes = conexao.prepareStatement("SELECT * FROM LISTA_TAREFAS Where id_tarefa = ?");
        comandoVerificaColaboradores = conexao.prepareStatement("SELECT * FROM TAREFA_COLABORADOR WHERE ID_TAREFA = ?");
        comandoListarColaboradores = conexao.prepareStatement("SELECT ID, NOME, EMAIL from COLABORADOR");
        comandoSeleciona = conexao.prepareStatement("SELECT * FROM TAREFAS");
        comandoAtribuiDependencia = conexao.prepareStatement("INSERT INTO LISTA_TAREFAS(ID_TAREFA, ID_TAREFA_PENDENTE) VALUES (?,?)");
        comandoListarAtribuiDependencia = conexao.prepareStatement("SELECT T.id, T.descricao, T.dt_inicio, T.dt_fim FROM TAREFAS T JOIN LISTA_TAREFAS LT ON (T.ID = LT.ID_TAREFA) WHERE T.ID_PROJETO = ? AND T.ID <> ? AND T.ID = LT.ID_TAREFA_PENDENTE");
    }

    @Override
    public void criar(Tarefa tarefa) throws Exception {
        comandoInsere.clearParameters();
        comandoInsere.setInt(1, tarefa.getID());
        comandoInsere.setInt(2, tarefa.getID_PROJETO());
        comandoInsere.setString(3, tarefa.getDESCRICAO());
        comandoInsere.setDate(4, new java.sql.Date (tarefa.getDT_INICIO().getTime()));
        comandoInsere.setDate(5, new java.sql.Date (tarefa.getDT_FIM().getTime()));
        comandoInsere.setString(6, tarefa.getSTATUS());
        comandoInsere.executeUpdate();
    }

    @Override
    public void excluir(Tarefa tarefa) throws Exception {
        comandoExclui.clearParameters();
        comandoExclui.setInt(1, tarefa.getID());
        comandoExclui.executeUpdate();
    }

    @Override
    public void alterar(Tarefa tarefa) throws Exception {
        comandoAltera.clearParameters();
        comandoAltera.setString(1, tarefa.getDESCRICAO());
        comandoAltera.setDate(2, new java.sql.Date (tarefa.getDT_INICIO().getTime()));
        comandoAltera.setDate(3, new java.sql.Date (tarefa.getDT_FIM().getTime()));
        comandoAltera.setInt(4, tarefa.getID());
        comandoAltera.executeUpdate();
    }

    @Override
    public Integer retornaID() throws Exception {
        Integer id = 0;
        ResultSet resultado = comandoSeleciona.executeQuery();
        while (resultado.next()) {
            id = resultado.getInt("id") + 1;
        }
        return id;
    }

    @Override
    public List<Tarefa> listaTodos() throws Exception {
        List<Tarefa> tarefas = new ArrayList<>();
        ResultSet resultado = comandoListarTodos.executeQuery();
        while (resultado.next()) {
            Tarefa tarefa = new Tarefa();
            tarefa.setID(resultado.getInt("id"));
            tarefa.setID_PROJETO(resultado.getInt("id_projeto"));
            tarefa.setDESCRICAO(resultado.getString("descricao"));
            tarefa.setDT_INICIO(resultado.getDate("dt_inicio"));
            tarefa.setDT_FIM(resultado.getDate("dt_fim"));
            tarefa.setSTATUS(resultado.getString("status"));
            tarefas.add(tarefa);
        }
        return tarefas;
    }

    

    @Override
    public List<Integer> listaTarefasDependentes(Integer id_tarefa) throws Exception {
        List<Integer> tarefas = new ArrayList<>();
        comandoListarDependentes.clearParameters();
        comandoListarDependentes.setString(1, id_tarefa.toString());
        comandoListarDependentes.executeUpdate();
        ResultSet resultado = comandoListarDependentes.executeQuery();
        while (resultado.next()) {
            if (resultado.getInt("finalizada") == 'N'){
                tarefas.add(resultado.getInt("id_tarefa_dependente"));   
            } 
        }  
        return tarefas;
    }

    @Override
    public List<Colaborador> listaColaboradores() throws Exception {
        List<Colaborador> colaboradores = new ArrayList<>();                
        ResultSet resultado = comandoListarColaboradores.executeQuery();
        while (resultado.next()) {
            Colaborador c = new Colaborador();                    
            c.setID(resultado.getInt("id"));
            c.setNOME(resultado.getString("nome"));
            c.setEMAIL(resultado.getString("email"));
            colaboradores.add(c);
        }  
        return colaboradores;
    }

    @Override
    public void atribuirDependencia(Tarefa tarefa, Tarefa tarefaDep) throws Exception {
        comandoInsere.clearParameters();
        comandoInsere.setInt(1, tarefa.getID());
        comandoInsere.setInt(2, tarefaDep.getID());
        comandoInsere.executeUpdate();
    }

    @Override
    public List<Tarefa> listaTodosAtribuicao(Tarefa t) throws Exception {
        List<Tarefa> tarefas = new ArrayList<>();
        comandoListarAtribuiDependencia.clearParameters();
        comandoListarAtribuiDependencia.setInt(1, t.getID_PROJETO());
        comandoListarAtribuiDependencia.setInt(2, t.getID());
        comandoListarAtribuiDependencia.executeUpdate();
        ResultSet resultado = comandoListarAtribuiDependencia.executeQuery();
        while (resultado.next()) {
            Tarefa tarefa = new Tarefa();
            tarefa.setID(resultado.getInt("id"));
            tarefa.setID_PROJETO(resultado.getInt("id_projeto"));
            tarefa.setDESCRICAO(resultado.getString("descricao"));
            tarefa.setDT_INICIO(resultado.getDate("dt_inicio"));
            tarefa.setDT_FIM(resultado.getDate("dt_fim"));
            tarefa.setSTATUS(resultado.getString("status"));
            tarefas.add(tarefa);
        }
        return tarefas;
    }

    @Override
    public Boolean verificaColaboradores(Integer id_tarefa) throws Exception {
        Boolean result = false;
        comandoVerificaColaboradores.clearParameters();
        comandoVerificaColaboradores.setString(1, id_tarefa.toString());
        //comandoListarColaboradores.executeUpdate();
        ResultSet resultado = comandoVerificaColaboradores.executeQuery();
        while (resultado.next()) {
            result = true;
        }        
        return result;        
    }

    @Override
    public void criarColaborador(Colaborador colab, String id_tarefa) throws Exception {
        comandoInsereColaborador.clearParameters();
        comandoInsereColaborador.setInt(1, colab.getID());
        comandoInsereColaborador.setString(2, id_tarefa);
        comandoInsereColaborador.executeUpdate();    
    }
    
}
