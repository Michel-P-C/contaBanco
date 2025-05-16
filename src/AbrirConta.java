import java.util.Scanner;

public class AbrirConta extends ContaTerminal{
    Scanner teclado = new Scanner(System.in);
    ContaTerminal conta = new ContaTerminal();

    int numero = 0;
    String ag = "";
    String nomeCliente = "";
    double saldoConta = 0;

    public void exibir() {
        System.out.print("Digite o número da sua conta: ");
        numero = teclado.nextInt();
        conta.numeroConta(numero);

        System.out.print("Digite o número da sua agência: ");
        ag = teclado.next();
        conta.ag(ag);

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = teclado.next();
        conta.nome(nomeCliente);

        System.out.print("Inserir em conta: ");
        saldoConta = teclado.nextDouble();
        conta.saldo(saldoConta);

        System.out.println("Olá " + nomeCliente +
                " obrigado por criar uma conta em nosso banco, " +
                "sua agência " + ag + " conta: " + numero + " e saldo:R$ " +
                saldoConta + " já está disponível para saque.");
    }




}
