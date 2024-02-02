package candidatos;

import java.util.Scanner;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        analisarCandidato(2000.0);
        analisarCandidato(3000.0);
        analisarCandidato(1000);
        
    }

    static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;

    if(salarioBase > salarioPretendido){

        System.out.println("LIGAR PARA CANDIDATO");
    }
    else if(salarioBase == salarioPretendido){

        System.out.println("FAZER CONTRA-PROPOSTA");
    }
    else{
        System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }


    
    }
}

