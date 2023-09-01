import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
                
        //Exibir as mensagens para o nossos usuários e obtenha, pela classe scanner, os valores digitados no terminal

        System.out.println("Insira o nome do cliente:");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("Insira o numero da conta:");
        int numero = scanner.nextInt();

        System.out.println("Insira o numero da agencia:");
        String agencia = scanner.next();
              
        System.out.println("Insira seu saldo:");
        double valor = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("Ola " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numero + " seu saldo " + valor + " ja esta disponivel para saque.");

    }
}
