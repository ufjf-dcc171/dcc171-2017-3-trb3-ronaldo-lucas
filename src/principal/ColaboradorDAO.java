package principal;

import java.util.List;

interface ColaboradorDAO {

    public void criar(Colaborador colaborador) throws Exception;
    public void excluir(Colaborador colaborador) throws Exception;
    public void alterar(Colaborador colaborador) throws Exception;
    public Integer retornaID() throws Exception;
    public List<Colaborador> listaTodos() throws Exception;
    
}
