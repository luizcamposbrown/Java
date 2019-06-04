package main;
import modelo.Cliente;
import modelo.Conta;
import modelo.JogadorDeFutebol;


public class Exercicio01 {

   public static void main(String[] args) {

       Cliente luiz = new Cliente("Luiz", "Campos");

       Conta conta = new Conta(481400, 100, luiz);
       conta.deposito(10);

       conta.saque(50);


       Cliente campos = new Cliente("campos", "jordão");

       Conta nubank = new Conta(847046, 50, campos);
       nubank.deposito(20);
       nubank.saque(10);

       JogadorDeFutebol neimar = new JogadorDeFutebol("neimar", 100, 60,0,45);
        neimar.fazerGol(1);
       neimar.fazerGol(1);

       neimar.correr(2);

   }
}
