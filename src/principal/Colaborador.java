package principal;

public class Colaborador {
    Integer ID;
    String NOME;
    String EMAIL;

    public Colaborador() {
    }

    public Colaborador(Integer ID, String NOME, String EMAIL) {
        this.ID = ID;
        this.NOME = NOME;
        this.EMAIL = EMAIL;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
    
}
