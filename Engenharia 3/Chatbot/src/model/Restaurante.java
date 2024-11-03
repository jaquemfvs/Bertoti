package model;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Restaurante implements Subject {
    private List<Reserva> reservas = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
        notifyObservers("Nova reserva criada: " + reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        notifyObservers("Reserva cancelada: " + reserva);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String mensagem) {
        for (Observer observer : observers) {
            observer.update(mensagem);
        }
    }
}