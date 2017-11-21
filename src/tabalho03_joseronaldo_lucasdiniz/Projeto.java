package tabalho03_joseronaldo_lucasdiniz;

import java.util.Date;

public class Projeto {
    Integer ID;
    String DESCRICAO;
    Date DT_INICIO;
    Date DT_FIM;

    public Projeto() {
    }

    public Projeto(Integer ID, String DESCRICAO, Date DT_INICIO, Date DT_FIM) {
        this.ID = ID;
        this.DESCRICAO = DESCRICAO;
        this.DT_INICIO = DT_INICIO;
        this.DT_FIM = DT_FIM;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    
}
