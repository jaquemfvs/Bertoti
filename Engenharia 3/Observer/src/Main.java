package src;

public class Main {
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido("Pizza Margherita");
        
        DisplayCozinha cozinha = new DisplayCozinha();
        DisplayGarcom garcom = new DisplayGarcom();
        
        pedido.addObserver(cozinha);
        pedido.addObserver(garcom);
       
        pedido.setStatus("Preparando");
      
        pedido.removeObserver(cozinha);
        System.out.println("\nCozinha removida. Status será atualizado apenas para o garçom.");
      
        pedido.setStatus("Pronto");
      
        pedido.removeObserver(garcom);
        System.out.println("\nGarçom removido. Nenhum observador para o próximo status.");
    
        pedido.setStatus("Entregue");
    }
}