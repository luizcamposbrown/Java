package modelo;

public class ContaPoupanca  extends Conta{

    private double taxaDeJuros;

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public ContaPoupanca(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public ContaPoupanca(double saldo, Cliente clinte, double taxaDeJuros) {
        super(saldo, clinte);
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(getSaldo()+ valor);
        System.out.println(getSaldo() + "  " + valor );
    }

    @Override
    public double sacar(double valor) {
      this.setSaldo(getSaldo() - valor );
      return this.getSaldo();

      /* if (valor <= this.getSaldo()) {
            this.setSaldo(getSaldo() - valor);
            System.out.println(getSaldo() + "  " + valor);
        } else {
            System.out.println("você não tem saldo suficiente");
        } */
    }

    @Override
    public double  consultaSaldo() {
        return this.getSaldo();
    }

    public void recolherJuros(){
        this.setSaldo(this.getSaldo() + (this.getSaldo() * this.getTaxaDeJuros()));
    }

}
