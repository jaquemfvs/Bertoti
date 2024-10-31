package model;

public class Livro {
    private String titulo;
    private String autor;
    private int dataPublicacao;
    private double preco;

    public Livro(String titulo, String autor, int dataPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean matches(Livro outroLivro) {
        return this.titulo.equalsIgnoreCase(outroLivro.getTitulo());
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Autor: " + autor + ", Data: " + dataPublicacao + ", Preço: R$" + preco;
    }
}