public class ClienteSeguro {
    private String nome;

    public ClienteSeguro() {}

    public ClienteSeguro(String nome) {
        this.nome = nome;
    }

    public String obterNomeDoCliente() {
        return this.nome;
    }
}