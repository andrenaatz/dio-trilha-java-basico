import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Bem-vindo! Cadastre seus Dados");
        System.out.println("Digite sua agência com digito: ");
        agencia = s.next();
        System.out.println("digite sua conta: ");
        conta = s.nextInt();
        System.out.println("qual o seu nome: ");
        nomeCliente = s.next();
        System.out.println("seu saldo: ");
        saldo = s.nextDouble();


        System.out.println("Olá "+nomeCliente 
        +" obrigado por criar uma conta em nosso banco," 
        +" sua agência é "+agencia+", conta"+conta 
        +" e seu saldo de "+saldo+" já está disponível para saque");
    }
}
