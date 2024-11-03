import controller.ReservaController;
import model.Mesa;
import model.Reserva;
import model.Restaurante;
import telegram.TelegramBotConfig;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        ReservaController controller = new ReservaController(restaurante);

             TelegramBotConfig.iniciarBot(restaurante);

        Mesa mesa1 = new Mesa(1, 4);
        Mesa mesa2 = new Mesa(2, 2);

        Reserva reserva1 = new Reserva("João", mesa1, "19:00");
        Reserva reserva2 = new Reserva("Maria", mesa2, "20:00");

        controller.adicionarReserva(reserva1);
        controller.adicionarReserva(reserva2);

        controller.cancelarReserva(reserva1);
    }
}