public interface reprodutorMusical {
    
    default void tocar(){
        System.out.println("musica tocando");
    }

    default void pausar(){
        System.out.println("Pausada a musica");
    }

    default void selecionarMusica(){
        System.out.println("musica selecionada");
    }
}
