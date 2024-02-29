package bancodedados;



public class Cliente {

    private int cpf;
    private String name;
    
    
    
    public int getCpf() {
        return cpf;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Cliente(int cpf, String name){

        this.cpf = cpf;
        this.name = name;

    }

    

    
}
