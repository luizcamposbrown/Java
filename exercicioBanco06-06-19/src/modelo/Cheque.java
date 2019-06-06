package modelo;

public class Cheque {

    private double valor;
    private String bancoEmissor;
    private String dataPgto;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public String getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(String dataPgto) {
        this.dataPgto = dataPgto;
    }

    public Cheque(double valor, String bancoEmissor, String dataPgto) {
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataPgto = dataPgto;
    }




}
