package principal;

import java.util.List;

interface ColaboradorDAO {

    public void criar(Colaborador colaborador) throws Exception;
    public List<Colaborador> listaTodos() throws Exception;
    
}
