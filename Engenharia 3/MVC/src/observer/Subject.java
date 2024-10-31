package observer;

import java.util.List;
import model.Livro;

public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers(List<Livro> encontrados);
}