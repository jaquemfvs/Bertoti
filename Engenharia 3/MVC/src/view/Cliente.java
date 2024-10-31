package view;

import observer.Observer;
import model.Livro;
import model.notificacao.Notificacao;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Observer {
    private String nome;
    private Notificacao notificacao;
    private List<Livro> livrosFavoritos = new ArrayList<>();

    public Cliente(String nome, Notificacao notificacao) {
        this.nome = nome;
        this.notificacao = notificacao;
    }

    public void setNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void update(List<Livro> livros) {
        System.out.println("Notificação para " + nome + ": Livros disponíveis:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        notificacao.enviarNotificacao("Novos livros foram encontrados!");
    }

    public void adicionarLivroFavorito(Livro livro) {
        livrosFavoritos.add(livro);
    }

    public void mostrarLivrosFavoritos() {
        System.out.println("Livros favoritos de " + nome + ":");
        for (Livro livro : livrosFavoritos) {
            System.out.println(livro);
        }
    }
}