package modelo;

public class ContaCorrente extends Conta {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaCorrente(double limite) {
        this.limite = limite;
    }

    public ContaCorrente(double saldo, Cliente cliente, double limite) {
        super(saldo, cliente);
        this.limite = limite;
    }



    @Override
    public void depositar(double valor) {
        this.setSaldo(getSaldo()+ valor);
        System.out.println(getSaldo() + "  " + valor );
    }

    @Override
    public double sacar(double valor) {
        this.setSaldo(getSaldo() - valor);
        System.out.println(getSaldo() + "  " + valor );
    }

    @Override
    public double consultaSaldo() {

        return this.getSaldo();
    }
}
