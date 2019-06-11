package metodos;

public class DepartamentoTI {
    private String deveJr;
    private String devePleno;
    private String scrumMaster;
    private String PO;

// getter and setter:

    public String getDeveJr() {
        return deveJr;
    }

    public void setDeveJr(String deveJr) {
        this.deveJr = deveJr;
    }

    public String getDevePleno() {
        return devePleno;
    }

    public void setDevePleno(String devePleno) {
        this.devePleno = devePleno;
    }

    public String getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(String scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

// construtor:

    public DepartamentoTI(String deveJr, String devePleno, String scrumMaster, String PO) {
        this.deveJr = deveJr;
        this.devePleno = devePleno;
        this.scrumMaster = scrumMaster;
        this.PO = PO;
    }
}
