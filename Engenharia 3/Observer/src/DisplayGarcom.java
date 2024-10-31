package src;
public class DisplayGarcom implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Display Garçom - O status do pedido mudou para: " + status);
    }
}
