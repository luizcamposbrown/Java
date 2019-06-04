package modelo;

public class SessaoDeTreinamento {
    private int experiencia;
    private int running;
    private int fazerGol;


   // Meus Getter and Setter:
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }


    // Meu Construtor:
    public SessaoDeTreinamento(int experiencia, int running, int fazerGol){
        this.experiencia = experiencia;
        this.running = running;
        this.fazerGol = fazerGol;
    }

    // Meu Metodo:
    public void treinamento(double ganho){
        this.experiencia = experiencia +  1
    }

    public void treinaA(String neimar){
        this.treinamento();
    }
}
