package modelo;

public class Cliente {

    private int numero;
    private String nome;
    private String numRG;
    private String numcCPf;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumRG() {
        return numRG;
    }

    public void setNumRG(String numRG) {
        this.numRG = numRG;
    }

    public String getNumcCPf() {
        return numcCPf;
    }

    public void setNumcCPf(String numcCPf) {
        this.numcCPf = numcCPf;
    }


    public Cliente(int numero, String nome, String numRG, String numcCPf) {
        this.numero = numero;
        this.nome = nome;
        this.numRG = numRG;
        this.numcCPf = numcCPf;
    }
}
