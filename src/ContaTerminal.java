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

    public int getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getAg(){
        return ag;
    }

    public void setAg(String ag){
        this.ag = ag;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }
}
