import java.util.Scanner;

public class AbrirConta extends ContaTerminal{
    Scanner teclado = new Scanner(System.in);
    ContaTerminal conta = new ContaTerminal();

    int numero = 0;
    String ag = "";
    String nomeCliente = "";
    double saldoConta = 0;

    public void exibir() {
        System.out.print("Digite o número da conta: ");
        numero = teclado.nextInt();
        conta.numeroConta(numero);

        System.out.print("Digite o número da agência a ser criada: ");
        ag = teclado.next();
        conta.ag(ag);

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = teclado.next();
        conta.nome(nomeCliente);

        System.out.print("Inserir saldo em conta: ");
        saldoConta = teclado.nextDouble();
        conta.saldo(saldoConta);

        System.out.println("Olá " + nomeCliente +
                " obrigado por criar uma conta em nosso banco, " +
                "sua agência " + ag + " conta: " + numero + " e saldo:R$ " +
                saldoConta + " já está disponível para saque.");
    }

    public void sacarDinheiro() {
        System.out.print("Deseja sacar s/n: ");
        String resposta = teclado.next();

        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Qual valor deseja sacar: ");
            double valorSaque = teclado.nextDouble();

            if (valorSaque <= saldoConta) {
                 saldoConta = saldoConta - valorSaque;
                System.out.println("Seu saldo agora é R$ " + saldoConta);
            } else
                System.out.println("Saldo insuficiente");

        }else if (resposta.equalsIgnoreCase("n")){
            System.out.println("Obrigado seu saldo na conta é R$ " + saldoConta + "o banco agradece a sua preferência.");
        }else
            System.out.println("Resposta inválida. Por favor, digite 's' ou 'n'.");
    }

}
