package model;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Estoque implements Subject {
    private List<Livro> livros = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addLivro(Livro livro) {
        livros.add(livro);
        notifyObservers(livros);
    }

    public void buscarLivro(Livro livro) {
        List<Livro> encontrados = new ArrayList<>();
        for (Livro l : livros) {
            if (l.matches(livro)) {
                encontrados.add(l);
            }
        }
        notifyObservers(encontrados);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(List<Livro> encontrados) {
        for (Observer observer : observers) {
            observer.update(encontrados);
        }
    }
}