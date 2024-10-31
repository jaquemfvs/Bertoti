package controller;

import model.Livro;
import model.Estoque;
import observer.Observer;

public class LojaController {
    private Estoque estoque;

    public LojaController(Estoque estoque) {
        this.estoque = estoque;
    }

    public void adicionarLivro(Livro livro) {
        estoque.addLivro(livro);
    }

    public void buscarLivro(Livro livro) {
        estoque.buscarLivro(livro);
    }

    public void registrarCliente(Observer cliente) {
        estoque.registerObserver(cliente);
    }
}