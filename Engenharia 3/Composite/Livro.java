public class Livro implements ComponentLivro {
    String nomeLivro;
    String nomeAutor;
    int anoLancamento;

    public Livro(String newNomeLivro, String newNomeAutor, int newAnoLancamento) {
        nomeLivro = newNomeLivro;
        nomeAutor = newNomeAutor;
        anoLancamento = newAnoLancamento;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void displayInfoLivro() {
        System.out.println(getNomeLivro() + " foi escrito por " + getNomeAutor() + " em " + getAnoLancamento());
    }
}