public class GeradorListaLivro {
    public static void main(String[] args) {
        ComponentLivro todaLivro = new GrupoLivro("Lista de Livros", "Todos os livros disponíveis");

        ComponentLivro ficcao = new GrupoLivro(
                "Ficção", "Gênero literário que contém histórias fictícias, com temas variados.");

        ComponentLivro fantasia = new GrupoLivro(
                "\nFantasia", "Gênero que apresenta elementos mágicos, universos imaginários e seres sobrenaturais.\n");

        ComponentLivro romance = new GrupoLivro(
                "\nRomance", "Gênero focado nas relações humanas e nos sentimentos dos personagens.\n");

        todaLivro.add(ficcao);

        ficcao.add(new Livro("1984", "George Orwell", 1949));
        ficcao.add(new Livro("Fahrenheit 451", "Ray Bradbury", 1953));

        ficcao.add(romance);

        romance.add(new Livro("Orgulho e Preconceito", "Jane Austen", 1813));
        romance.add(new Livro("Anna Karenina", "Leo Tolstoy", 1877));

        todaLivro.add(fantasia);

        fantasia.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        fantasia.add(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997));

        DiscJockey bibliotecario = new DiscJockey(todaLivro);

        bibliotecario.getListaLivro();
    }
}
