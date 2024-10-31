public class Facade {
    private ClienteSeguro cliente;
    private ApoliceSeguro conta;
  
    public Facade() {
        this.cliente = new ClienteSeguro();
        this.conta = new ApoliceSeguro();
    }
  
    public void pagarParcela(int quantidade, ClienteSeguro cliente, ApoliceSeguro conta){
        System.out.printf("Olá, você pgou a Apolice do cliente %s\n",cliente.obterNomeDoCliente());
        System.out.printf("Você escolheu a Apolice %s\n", conta.obterNumApolice());
        System.out.printf("O saldo desta conta é: %d\n", conta.obterSaldo());
        System.out.printf("Você está depositando R$ %s\n", quantidade);
        conta.setSaldo(conta.getSaldo() + quantidade);
        System.out.printf("Depositado R$ %d na conta de %s\n",quantidade, cliente.obterNomeDoCliente());
        System.out.printf("O saldo desta conta é: R$ %s\n", conta.obterSaldo());
    }
  
    public ClienteSeguro getCliente() {
        return cliente;
    }
  
    public void setCliente(ClienteSeguro cliente) {
        this.cliente = cliente;
    }
  
    public ApoliceSeguro getConta() {
        return conta;
    }
  
    public void setConta(ApoliceSeguro conta) {
        this.conta = conta;
    }
  }