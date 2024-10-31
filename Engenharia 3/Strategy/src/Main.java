import com.example.pedal.Bicicleta;
import com.example.pedal.Eletrica;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import com.example.pedal.Manual;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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