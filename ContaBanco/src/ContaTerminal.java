import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String agencia;
        String cliente;
        int numeroConta;
        Float saldo = 0.00f;
    
        Scanner terminal = new Scanner(System.in);


        System.out.print("Por favor, digite o número da Agencia: ");
        agencia = terminal.next();

        System.out.printf("Agencia: %s\n", agencia);

        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = terminal.nextInt();
        terminal.nextLine();
        System.out.printf("Conta: %d\n", numeroConta);

        System.out.print("Por favor, digite o nome do Cliente: ");
        cliente = terminal.nextLine();
        System.out.printf("Cliente: %s\n", cliente);

        System.out.println("Seu saldo atual é " + saldo + " deseja inserir um valor? (S/N): ");
        char resposta = terminal.nextLine().charAt(0);

        if (resposta == 'S' || resposta == 's'){
            
            System.out.print("Digite o valor a ser inserido: ");
            saldo = terminal.nextFloat();
            System.out.printf("Valor inserido: %.2f\n", saldo);
            System.out.println("Olá " + cliente + ", obrigado por permanecer conosco. Sua agência é " + agencia + ", e conta " + numeroConta + ". Seu saldo atual é " + saldo + " e já está disponível para saque.");
        } else {
            
            System.out.printf("Seu saldo atual é %.2f\n", saldo);
            System.out.println("Olá " + cliente + ", obrigado por permanecer conosco. Sua agência é " + agencia + ", e conta " + numeroConta + ". Seu saldo atual é " + saldo + ".");
        }


        /*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco,
        sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já
        está disponível para saque".
        */
        terminal.close();








    }

    



}
