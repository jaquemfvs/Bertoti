public class ApoliceSeguro {
    private String conta;
      private double saldo;
  
      public double pagar(double valor){
          System.out.println("Pagando...");
          return this.setSaldo(this.getSaldo() + valor);
      }
  
      public String obterNumApolice(){
          System.out.println("Obtendo número da Apolice...");
          return this.conta;
      }
  
      public double obterSaldo(){
          System.out.println("Obtendo saldo...");
          return this.getSaldo();
      }
  
      public ApoliceSeguro(){}
  
      public ApoliceSeguro(String conta){
          this.conta = conta;
      }
  
      public double getSaldo() {
          return saldo;
      }
  
      public double setSaldo(double saldo) {
          this.saldo = saldo;
          return saldo;
      }
  }