import Pedal.Eletrica;
import Pedal.Manual;

public class Main {
    public static void main(String[] args) {
        System.out.println("- Análise Bike -");
        System.out.println("#Pedal");
        Bicicleta bicicleta = new Bicicleta();

        bicicleta.setPedal(new Eletrica());
        bicicleta.usarPedal();

        bicicleta.setPedal(new Manual());
        bicicleta.usarPedal();
    }
}