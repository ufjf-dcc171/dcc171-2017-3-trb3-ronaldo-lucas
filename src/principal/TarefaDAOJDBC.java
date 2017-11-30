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
    private final PreparedStatement comandoListar;
    private final PreparedStatement comandoSeleciona;

    public TarefaDAOJDBC() throws Exception {
        conexao = ConexaoJavaDB.getConnection();
        comandoInsere = conexao.prepareStatement("Insert Into TAREFA(id, id_projeto, descricao, dt_inicio, dt_fim) VALUES (?,?,?,?,?)");
        comandoExclui = conexao.prepareStatement("Delete From TAREFA Where ID = ?");
        comandoAltera = conexao.prepareStatement("Update TAREFA set descricao = ?, dt_inicio = ?, dt_fim = ? where id = ?");
        comandoListar = conexao.prepareStatement("SELECT id, id_projeto, descricao, dt_inicio, dt_fim FROM TAREFA");
        comandoSeleciona = conexao.prepareStatement("SELECT * FROM TAREFA");
    }

    @Override
    public void criar(Tarefa tarefa) throws Exception {
        comandoInsere.clearParameters();
        comandoInsere.setInt(1, tarefa.getID());
        comandoInsere.setString(2, tarefa.getDESCRICAO());
        comandoAltera.setDate(3, new java.sql.Date (tarefa.getDT_INICIO().getTime()));
        comandoAltera.setDate(4, new java.sql.Date (tarefa.getDT_FIM().getTime()));
        comandoInsere.executeUpdate();
    }

    @Override
    public void excluir(Tarefa tarefa) throws Exception {
        /**
         * ********************************************************************
         * Além de excluir a tarefa, deve apagar tbm as tarefas ligadas a ele*
         ********************************************************************
         */
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
        ResultSet resultado = comandoListar.executeQuery();
        while (resultado.next()) {
            Tarefa tarefa = new Tarefa();
            tarefa.setID(resultado.getInt("id"));
            tarefa.setDESCRICAO(resultado.getString("descricao"));
            tarefa.setDT_INICIO(resultado.getDate("dt_inicio"));
            tarefa.setDT_FIM(resultado.getDate("dt_fim"));
            tarefas.add(tarefa);
        }
        return tarefas;
    }
}
