package metodos;

public class DepartamentoRH {

    private String gerente;
    private String recrutador;
    private String administrador;

// gatter and setter:

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getRecrutador() {
        return recrutador;
    }

    public void setRecrutador(String recrutador) {
        this.recrutador = recrutador;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

// construtor:

    public DepartamentoRH(String gerente, String recrutador, String administrador) {
        this.gerente = gerente;
        this.recrutador = recrutador;
        this.administrador = administrador;
    }
}
