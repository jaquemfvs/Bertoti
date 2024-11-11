package src;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String status;
    private String prato;
    private List<Observer> observadores;

    public Pedido(String prato) {
        this.prato = prato;
        this.status = "Novo";
        this.observadores = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observadores) {
            observer.update(status);
        }
    }

    public String getStatus() {
        return status;
    }

    public String getPrato() {
        return prato;
    }
}