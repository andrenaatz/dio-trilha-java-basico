package bancodedados;

public abstract class Conta implements IConta {
    //variavel da classe
    private static int SEQUENCIA = 1;

    //variaveis
    private String banco = Banco.bankName;
    private int agencia = Banco.agencyNumber;
    protected int numeroConta;

    

    private float saldo;

    private Cliente cliente;

     //construtor

    public Conta(Cliente cliente){
        this.numeroConta = SEQUENCIA++;
        this.cliente = cliente;
    }
    
    //getters and setters
    
    public String getBanco() {
        return banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo(){

        return saldo;
    }


    //metodos
    @Override
    public void depositar(double valor) {
        
        saldo += valor;

        
    }

    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }

    @Override
    public void tranferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
               
    }

    protected void imprimirInfoConta(){
        System.out.println(String.format("Banco: %s", this.getBanco()));
        System.out.println(String.format("Agência número: %d", this.getAgencia()));
        System.out.println(String.format("Número da conta: %d", this.numeroConta));
        System.out.println(String.format("Titular: %s", this.cliente.getName()));
        System.out.println(String.format("Saldo: %.2f", this.saldo ));

    }

    

    
    
}
