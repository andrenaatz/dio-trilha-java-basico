public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
    
    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Escolhendo música");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarComandoDeVoz() {
        // TODO Auto-generated method stub
        System.out.println("Comando de Voz acionado");
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Página exibida");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Criado nova aba");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Página atualizada");
    }

}
