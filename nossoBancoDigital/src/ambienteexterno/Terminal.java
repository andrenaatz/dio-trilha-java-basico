package ambienteexterno;



import java.util.Scanner;

import bancodedados.Cliente;
import bancodedados.Conta;
import bancodedados.ContaCorrente;
import bancodedados.ContaPoupanca;

public class Terminal {

    public static void main(String[] args) {
        
        Cliente andre = new Cliente(895425769, "Andre Ricardo");

        Conta cc = new ContaCorrente(andre);

        Conta poup = new ContaPoupanca(andre);

        Scanner sc = new Scanner(System.in);

        float provisorio;

        System.out.println("digite um valor para depositar: ");
            while(!sc.hasNextFloat()){
                System.out.println("Entrada inválida. Deve ser um número, usando ponto em vez de virgula.");
                sc.next();
            }
        provisorio = sc.nextFloat();
        System.out.println("Valor depositado: "+provisorio);
        cc.depositar(provisorio);        
        cc.imprimirExtrato();

        //vai permanecer neste loop até que seja digitado uma valor float e
        //que seja um valor disponivel no saldo
        while(true){
            System.out.println("digite um valor para sacar: ");
            while(!sc.hasNextFloat()){
                System.out.println("Entrada inválida. Deve ser um número, usando ponto em vez de virgula.");
                sc.next();
            }
        
        provisorio = sc.nextFloat();
    
            if(provisorio>cc.getSaldo()){

                System.out.println("valor maior que o saldo disponivel");
                System.out.println("Saldo no momento: "+cc.getSaldo());
        
            }
            else{
                break;
            }
        } 
         
        System.out.println("Valor sacado: "+provisorio);
        cc.sacar(provisorio);
        cc.imprimirExtrato();

        while(true){
        System.out.println("digite um valor para tranferir: ");
        while(!sc.hasNextFloat()){
            System.out.println("Entrada inválida. Deve ser um número, usando ponto em vez de virgula.");
            sc.next();
        }
        provisorio = sc.nextFloat();

        if(provisorio>cc.getSaldo()){

            System.out.println("valor maior que o saldo disponivel");
            System.out.println("Saldo no momento: "+cc.getSaldo());
    
        }
        else{
            break;
        }
        }
        System.out.println("Valor transferido: "+provisorio);
        cc.tranferir(provisorio, poup);
        poup.imprimirExtrato();
        cc.imprimirExtrato();

        sc.close();

        

        
    }
    
}
