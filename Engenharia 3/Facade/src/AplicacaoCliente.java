public class AplicacaoCliente {
    public static void main(String[] args) {
        ClienteSeguro cliente = new ClienteSeguro ("Joana Prado");
        ApoliceSeguro conta = new ApoliceSeguro("1345-0");

        Facade facade = new Facade();
        facade.pagarParcela(250, cliente, conta);
    }
}