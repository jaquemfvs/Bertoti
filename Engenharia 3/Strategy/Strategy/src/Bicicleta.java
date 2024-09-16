public class Bicicleta {
    private Pedal pedal;

    public void setPedal(Pedal pedal) {
        this.pedal = pedal;
    }

    public void usarPedal() {
        if (pedal != null) {
            pedal.usarPedal();
        } else {
            System.out.println("Pedal não definido.");
        }
    }
}