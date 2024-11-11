public class ApoliceSeguro {
    private String conta;
    private double saldo;

    // Construtor padrão
    public ApoliceSeguro() {}

    // Construtor com número da conta
    public ApoliceSeguro(String conta) {
        this.conta = conta;
        this.saldo = 0; // Inicia o saldo como 0
    }

    public String obterNumApolice() {
        System.out.println("Obtendo número da Apólice...");
        return this.conta;
    }

    public double obterSaldo() {
        System.out.println("Obtendo saldo...");
        return this.saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}