import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();  // Ler número da conta como inteiro

        scanner.nextLine();  // Limpar o buffer de leitura

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();  // Ler saldo como número decimal

        // Exibindo a mensagem com as informações inseridas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
