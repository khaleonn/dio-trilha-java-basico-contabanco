import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroCliente;
        int agencia;
        String nomeCliente;
        double saldoDisponivel = 237.48;

        System.out.println("Olá, bem-vindo ao nosso banco! Por favor, digite o número da sua agência");
        Scanner scan = new Scanner(System.in);
        agencia = scan.nextInt();

        System.out.println("Grato! Por gentileza informe seu nome");
        nomeCliente = scan.next();

        System.out.println("obrigado por criar uma conta em nosso banco " + nomeCliente + "! Sua agência é " + agencia + " e seu saldo disponível é de R$237.48");



    
        //TODO: Conhecer e importar a classe scanner

        //Exibir as mensagens para o nosso usuario

        //Obter pela scanner, os valores digitados no terminal  

        //Exibir a mensagem conta criada
         
    }

}
