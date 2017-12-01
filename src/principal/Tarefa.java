package principal;

import java.util.Date;
import java.util.List;

public class Tarefa {
    private Integer ID;
    private Integer ID_PROJETO;
    private String DESCRICAO;
    private Date DT_INICIO;
    private Date DT_FIM;
    private String STATUS;
    

    public Tarefa() {
    }

    public Tarefa(Integer ID, Integer ID_PROJETO, String DESCRICAO, Date DT_INICIO, Date DT_FIM, String status) {
        this.ID = ID;
        this.ID_PROJETO = ID_PROJETO;
        this.DESCRICAO = DESCRICAO;
        this.DT_INICIO = DT_INICIO;
        this.DT_FIM = DT_FIM;
        this.STATUS = status;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID_PROJETO() {
        return ID_PROJETO;
    }

    public void setID_PROJETO(Integer ID_PROJETO) {
        this.ID_PROJETO = ID_PROJETO;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    public Date getDT_INICIO() {
        return DT_INICIO;
    }

    public void setDT_INICIO(Date DT_INICIO) {
        this.DT_INICIO = DT_INICIO;
    }

    public Date getDT_FIM() {
        return DT_FIM;
    }

    public void setDT_FIM(Date DT_FIM) {
        this.DT_FIM = DT_FIM;
    }
    
    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
    
}
