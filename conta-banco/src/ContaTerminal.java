import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nome = "";
        String sobrenome = "";
        Double saldo = 0.0;

        System.out.println("Informe o número da sua conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o número da sua agência: ");
        agencia = scanner.nextLine();

        System.out.println("Informe o seu primeiro nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe o sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("Informe o valor do seu depósito inicial: ");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(
            "Olá " 
            + nome.concat(" ").concat(sobrenome)
            + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia 
            + ", conta " 
            + numero 
            + " e seu saldo " 
            + saldo 
            + " já está disponivel para saque");

        scanner.close();    

    }
}
