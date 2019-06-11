package metodos;

public class Funcionarios {
    private String nome;
    private String funçao;


// getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFunçao() {
        return funçao;
    }

    public void setFunçao(String funçao) {
        this.funçao = funçao;
    }

// contrutor
    public Funcionarios(String nome, String funçao) {
        this.nome = nome;
        this.funçao = funçao;
    }



}
