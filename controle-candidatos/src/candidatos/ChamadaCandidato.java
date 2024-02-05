package candidatos;

import java.util.ArrayList;
import java.util.Random;

public class ChamadaCandidato {

    public static void main(String[] args) {
        
        String[] candidatos = {"andre", "fabio", "luiz"};

        

        ArrayList<String> candidatosConfirmados = new ArrayList<>();

        for(int x=0; x<candidatos.length;x++){

           
            System.out.println("vamos ligar para o candidato "+candidatos[x] );

            for(int tentativa=1;tentativa<=3;tentativa++){

                System.out.println("tentativa de contato "+tentativa);
                
                if(chamarLigacao()){

                    System.out.println("atendeu!!!");
                    candidatosConfirmados.add(candidatos[x]); 
                    break;
                }
                else if(tentativa==3) {

                    System.out.println("não atendeu! Vamos ao proximo candidato");
                }
                else {
                    System.out.println("não atendeu! vamos tentar novamente");
                }
            }
        }
        
        System.out.println("Os candidatos confirmados são: ");

        if(candidatosConfirmados.size()>0){

           for(String candidato : candidatosConfirmados){

            System.out.println(candidato);
           }
        }
        else{

            System.out.println("ninguem atendeu!!!");
           }
        }

     


    
    
    static boolean chamarLigacao(){

        return new Random().nextInt(3)==1;
    }

}
