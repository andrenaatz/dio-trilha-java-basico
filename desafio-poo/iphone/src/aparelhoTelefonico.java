public interface aparelhoTelefonico {

    default void ligar(){
        System.out.println("Fazendo ligação");
    }

    default void atender(){
        System.out.println("Ligação atendida");
    }

    default void iniciarComandoDeVoz(){
        System.out.println("Comando de Voz iniciado");
    }
    
}
