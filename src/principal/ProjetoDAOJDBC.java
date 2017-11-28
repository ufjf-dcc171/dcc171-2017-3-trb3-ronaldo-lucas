package principal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProjetoDAOJDBC implements ProjetoDAO {

    private final Connection conexao;
    private final PreparedStatement comandoInsere;
    private final PreparedStatement comandoExclui;
    private final PreparedStatement comandoAltera;
    private final PreparedStatement comandoListar;
    private final PreparedStatement comandoSeleciona;

    public ProjetoDAOJDBC() throws Exception {
        conexao = ConexaoJavaDB.getConnection();
        comandoInsere = conexao.prepareStatement("Insert Into PROJETO(id, descricao, dt_inicio, dt_fim) VALUES (?,?,?,?)");
        comandoExclui = conexao.prepareStatement("Delete From PROJETO Where ID = ?");
        comandoAltera = conexao.prepareStatement("Update PROJETO set descricao = ?, dt_inicio = ?, dt_fim = ? where id = ?");
        comandoListar = conexao.prepareStatement("SELECT id, descricao, dt_inicio, dt_fim FROM PROJETO");
        comandoSeleciona = conexao.prepareStatement("SELECT * FROM PROJETO");
    }

    @Override
    public void criar(Projeto projeto) throws Exception {
        comandoInsere.clearParameters();
        comandoInsere.setInt(1, projeto.getID());
        comandoInsere.setString(2, projeto.getDESCRICAO());
        comandoInsere.setDate(3, (Date) projeto.getDT_INICIO());
        comandoInsere.setDate(4, (Date) projeto.getDT_FIM());
        comandoInsere.executeUpdate();
    }

    @Override
    public void excluir(Projeto projeto) throws Exception {
        /**********************************************************************
         * Além de excluir o projeto, deve apagar tbm as tarefas ligadas a ele*
         *********************************************************************/
        comandoExclui.clearParameters();        
        comandoExclui.setInt(1, projeto.getID());
        comandoExclui.executeUpdate();
    }

    @Override
    public void alterar(Projeto projeto) throws Exception {
        comandoAltera.clearParameters();        
        comandoAltera.setString(1, projeto.getDESCRICAO());
        comandoAltera.setDate(2, (Date) projeto.getDT_INICIO());
        comandoAltera.setDate(3, (Date) projeto.getDT_FIM());
        comandoAltera.setInt(4, projeto.getID());
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
    public List<Projeto> listaTodos() throws Exception {
        List<Projeto> projetos = new ArrayList<>();
        ResultSet resultado = comandoListar.executeQuery();
        while (resultado.next()) {
            Projeto projeto = new Projeto();
            projeto.setID(resultado.getInt("id"));
            projeto.setDESCRICAO(resultado.getString("descricao"));
            projeto.setDT_INICIO(resultado.getDate("dt_inicio"));
            projeto.setDT_FIM(resultado.getDate("dt_fim"));
            projetos.add(projeto);
        }
        return projetos;
    }
}
