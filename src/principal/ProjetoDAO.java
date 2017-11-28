package principal;

import java.util.List;

interface ProjetoDAO {

    public void criar(Projeto projeto) throws Exception;
    public void excluir(Projeto projeto) throws Exception;
    public void alterar(Projeto projeto) throws Exception;
    public Integer retornaID() throws Exception;
    public List<Projeto> listaTodos() throws Exception;
    
}
