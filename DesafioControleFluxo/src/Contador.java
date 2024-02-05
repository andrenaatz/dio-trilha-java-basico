import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        boolean repete; 
        Scanner terminal = new Scanner(System.in);

    do {   
        
        repete = false;

        System.out.println("digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("digite o segundo número: ");
        int paramentroDois = terminal.nextInt();


       try {

            contar(parametroUm, paramentroDois);


            
        } catch (ParametrosInvalidosException e ) {
            // TODO: handle exception

            repete = true;

            System.out.println("O segundo parametro deve ser maior que o primeiro");
            System.out.println("");
            System.out.println("--------------------------");
            System.out.println("");
        }
        
                
    } while(repete);

    terminal.close();
    System.out.println("chegamos ao final");
}

    static void contar(int parametroUm, int paramentroDois) throws ParametrosInvalidosException{

        if (parametroUm>paramentroDois){

            throw new ParametrosInvalidosException();

        }


        int contagem = paramentroDois - parametroUm;

        System.out.println("a quantidade de repetições deverá ser: "+contagem);

        for(int x=1;x<=contagem;x++){
            System.out.println(x);

        }

        
    }

    

}
