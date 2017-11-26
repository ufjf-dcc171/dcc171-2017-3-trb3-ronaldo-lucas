package principal;

import java.util.List;

interface ProjetoDAO {

    public void criar(Projeto proj) throws Exception;
    public List<Projeto> listaTodos() throws Exception;
    
}
