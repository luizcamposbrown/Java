package modelo;

public class JogadorDeFutebol {
    private String name;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    // Meu Contrutor:
    public JogadorDeFutebol(String name, int energia, int alegria, int gols, int experiencia) {
        this.name = name;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }
    // Meus Metodo:
    public void fazerGol(double resultado) {
        this.energia = this.energia - 5;
        this.alegria = this.alegria + 10;
        this.gols = this.gols + 1;
        System.out.println("GOoooLLL");
        System.out.println(energia);
        System.out.println(alegria);
        System.out.println(gols);
    }
        public void correr(double valor){
            this.energia = this.energia -10;
            System.out.println("Canseeei");

        }



}
