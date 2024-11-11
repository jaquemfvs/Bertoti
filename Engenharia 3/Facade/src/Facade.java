public class Facade {
    private  ClienteSeguro cliente;
    private  ApoliceSeguro conta;

    // Construtor que recebe cliente e conta como parâmetros
    public Facade(ClienteSeguro cliente, ApoliceSeguro conta) {
        this.cliente = cliente;
        this.conta = conta;
    }

    public void pagarParcela(double valor) {
        System.out.printf("Olá, você pagou a Apólice do cliente %s\n", cliente.obterNomeDoCliente());
        System.out.printf("Você escolheu a Apólice %s\n", conta.obterNumApolice());
        System.out.printf("O saldo desta conta é: R$ %.2f\n", conta.obterSaldo());
        System.out.printf("Você está depositando R$ %.2f\n", valor);
        
        conta.setSaldo(conta.getSaldo() + valor);
        
        System.out.printf("Depositado R$ %.2f na conta de %s\n", valor, cliente.obterNomeDoCliente());
        System.out.printf("O saldo atualizado desta conta é: R$ %.2f\n", conta.obterSaldo());
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