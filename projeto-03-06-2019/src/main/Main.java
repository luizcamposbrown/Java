package main;
import modelo.Cliente;
import modelo.Conta;

public class Main {

   public static void main(String[] args) {

       Cliente luiz = new Cliente("Luiz", "Campos");

       Conta conta = new Conta(481400, 100, luiz);
       conta.deposito(10);


   }
}
