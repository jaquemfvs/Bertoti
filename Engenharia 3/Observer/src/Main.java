package src;

public class Main {
    public static void main(String[] args) {
        
        // Criação do pedido no restaurante
        Pedido pedido = new Pedido("Pizza Margherita");
        
        // Criando observadores (displays)
        DisplayCozinha cozinha = new DisplayCozinha();
        DisplayGarcom garcom = new DisplayGarcom();
        
        // Adicionando os observadores ao pedido
        pedido.addObserver(cozinha);
        pedido.addObserver(garcom);
        
        // Simulação da alteração de status do pedido
        pedido.setStatus("Preparando");
        
        // Removendo um observador (DisplayCozinha)
        pedido.removeObserver(cozinha);
        
        // Continuando a simulação da alteração de status do pedido
        pedido.setStatus("Pronto");
        
        // Removendo o outro observador (DisplayGarcom)
        pedido.removeObserver(garcom);
        
        // Mudando o status do pedido para "Entregue", mas não será notificado (sem observadores)
        pedido.setStatus("Entregue");
    }
}
