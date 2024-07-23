import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero = 1; 
        String Agencia = ""; 
        String Nome = ""; 
        String Sobrenome = "";
        double Saldo = 0.0; 

        // observação valida para estudo.. println é para exibir dados na tela e print é para receber dados do teclado
        // Print é para receber dados do teclado
        

        System.out.println("Bem-vindo ao Banco Banco do Brasil!");
        System.out.print("Informe seu nome: ");
        Nome = sc.nextLine();

        System.out.println("Bem-vindo ao Banco Banco do Brasil!");
        System.out.print("Informe seu sobrenome: ");
        Sobrenome = sc.nextLine();

        System.out.print("Informe o número da sua conta: ");
        Numero = sc.nextInt();

        sc.nextLine(); // Limpar o buffer após a leitura de um número inteiro

        System.out.print("Informe a agência: ");
        Agencia = sc.nextLine();

        // Lendo e convertendo o valor do saldo
        System.out.print("Informe o valor que deseja depositar: ");
        String saldoString = sc.nextLine();
        try {
            Saldo = Double.parseDouble(saldoString);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido para o saldo. Usando saldo inicial: R$ " + Saldo);
        }

        String nomecompleto = nomeCompleto(Nome, Sobrenome);
        // Exibindo informações fornecidas pelo usuário
        System.out.println("\nConta Criada com Sucesso!  :)  \nObrigado por criar sua conta aqui no banco Banco do Brasil");
        System.out.println("\nInformações da Conta:");
        System.out.println("Nome do Cliente: " + nomecompleto);
        System.out.println("Número da Conta: " + Numero);
        System.out.println("Agência: " + Agencia);
        System.out.println("Saldo Inicial: R$ " + Saldo);
        System.out.println("Saldo disponivel para saque é R$ " + Saldo);

        // Encerrando o Scanner
        sc.close();
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return nome + " " + sobrenome;
    
    }
}
