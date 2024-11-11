import Pedal.Pedal;

public class Bicicleta {
    private Pedal pedal;

    public void setPedal(Pedal pedal) {
        this.pedal = pedal;
    }

    public void usarPedal() {
        pedal.usarPedal();
    }
}