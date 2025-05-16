import java.util.Scanner;

public class ContaTerminal {
    private int numeroConta;
    private String ag;
    private String nome;
    private double saldo;

    public void numeroConta(int numero){
        numeroConta = numero;
    }

    public void ag(String numeroAg){
        ag = numeroAg;
    }

    public void nome(String nomeCliente){
        nome = nomeCliente;
    }

    public void saldo (double valorEmConta){
        saldo = valorEmConta;
    }

    public void exibir(){
        System.out.println("Número da conta: " );

    }

}
