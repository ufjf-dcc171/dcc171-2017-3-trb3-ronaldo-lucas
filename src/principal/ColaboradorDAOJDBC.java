package principal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ColaboradorDAOJDBC implements ColaboradorDAO{
    private final Connection conexao;
    private final PreparedStatement comandoInsere;
    private final PreparedStatement comandoExclui;
    private final PreparedStatement comandoAltera;
    private final PreparedStatement comandoListar;
    private final PreparedStatement comandoSeleciona;
    
    public ColaboradorDAOJDBC() throws Exception{
        conexao = ConexaoJavaDB.getConnection();
        comandoInsere = conexao.prepareStatement("Insert Into COLABORADOR(id, nome, email) VALUES (?,?,?)");
        comandoExclui = conexao.prepareStatement("Delete From COLABORADOR Where ID = ?");
        comandoAltera = conexao.prepareStatement("Update COLABORADOR set nome = ?, email = ? where id = ?");
        comandoListar = conexao.prepareStatement("SELECT id, nome, email FROM COLABORADOR");
        comandoSeleciona = conexao.prepareStatement("SELECT * FROM COLABORADOR");
    }
    
    
    @Override
    public void criar(Colaborador colaborador) throws Exception {
        comandoInsere.clearParameters();
        comandoInsere.setInt(1, colaborador.getID());
        comandoInsere.setString(2, colaborador.getNOME());
        comandoInsere.setString(3, colaborador.getEMAIL());
        comandoInsere.executeUpdate();
    }

    @Override
    public List<Colaborador> listaTodos() throws Exception {
        List<Colaborador> colaboradores = new ArrayList<>();
        ResultSet resultado = comandoListar.executeQuery();
        while (resultado.next()) {
            Colaborador colab = new Colaborador();
            colab.setID(resultado.getInt("id"));
            colab.setNOME(resultado.getString("nome"));
            colab.setEMAIL(resultado.getString("email"));
            colaboradores.add(colab);
        }
        return colaboradores;
    }

    @Override
    public void excluir(Colaborador colaborador) throws Exception {
        comandoExclui.clearParameters();        
        comandoExclui.setInt(1, colaborador.getID());
        comandoExclui.executeUpdate();
    }

    @Override
    public void alterar(Colaborador colaborador) throws Exception {
        comandoAltera.clearParameters();        
        comandoAltera.setString(1, colaborador.getNOME());
        comandoAltera.setString(2, colaborador.getEMAIL());
        comandoAltera.setInt(3, colaborador.getID());
        comandoAltera.executeUpdate();
    }

    @Override
    public Integer retornaID() throws Exception {
        Integer id = 1;
        ResultSet resultado = comandoSeleciona.executeQuery();
        while (resultado.next()) {
            id = resultado.getInt("id") + 1;
        }        
        return id;
    }
    
}
