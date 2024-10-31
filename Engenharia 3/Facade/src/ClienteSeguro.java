public class ClienteSeguro{
    private String nome;
  
    public String obterNomeDoCliente(){
        return this.nome;
    }
  
    public ClienteSeguro(){}
  
    public ClienteSeguro (String nome){
        this.nome = nome;
    }
  }