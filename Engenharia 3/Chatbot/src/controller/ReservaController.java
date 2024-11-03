package controller;

import model.Mesa;
import model.Reserva;
import model.Restaurante;
import observer.Observer;

public class ReservaController {
    private Restaurante restaurante;

    public ReservaController(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void adicionarReserva(Reserva reserva) {
        restaurante.addReserva(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        restaurante.cancelarReserva(reserva);
    }

    public void registrarObserver(Observer observer) {
        restaurante.registerObserver(observer);
    }
}