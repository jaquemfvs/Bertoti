public class AplicacaoCliente {
    public static void main(String[] args) {
        ClienteSeguro cliente = new ClienteSeguro("Joao Prado");
        ApoliceSeguro conta = new ApoliceSeguro("1345-0");

        Facade facade = new Facade(cliente, conta);
        facade.pagarParcela(250.00);
    }
}