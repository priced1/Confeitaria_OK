package fieb.aula.confeitaria.model;

public class PedidoModel {

    private int ID_CURSO;
    private String FOTOCURSO;
    public String CURSO;
    private String CARGA_HORARIA;
    private String DESCRICAO;

    public int getID_CURSO() {
        return ID_CURSO;
    }

    public void setID_CURSO(int ID_CURSO) {
        this.ID_CURSO = ID_CURSO;
    }

    public String getFOTOCURSO() {
        return FOTOCURSO;
    }

    public void setFOTOCURSO(String FOTOCURSO) {
        this.FOTOCURSO = FOTOCURSO;
    }

    public String getCURSO() {
        return CURSO;
    }

    public void setCURSO(String CURSO) {
        this.CURSO = CURSO;
    }

    public String getCARGA_HORARIA() {
        return CARGA_HORARIA;
    }

    public void setCARGA_HORARIA(String CARGA_HORARIA) {
        this.CARGA_HORARIA = CARGA_HORARIA;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }
}
