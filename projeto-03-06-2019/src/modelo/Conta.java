package modelo;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta(int numeroConta, double saldo, Cliente titular ){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void deposito(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("foi depositado " + valor);
    }

    public void saque(double valor){
        this.saldo = this.saldo - valor;
        System.out.println("valor sacado é " + valor);
    }


}
