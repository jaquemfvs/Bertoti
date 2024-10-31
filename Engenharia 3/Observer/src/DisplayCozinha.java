package src;
public class DisplayCozinha implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Display Cozinha - O status do pedido mudou para: " + status);
    }
}
