import model.Estoque;
import model.Livro;
import controller.LojaController;
import view.Cliente;
import model.notificacao.NotificacaoEmail;
import model.notificacao.NotificacaoSMS;

public class Main {
    public static void main(String[] args) {
        // Criando o estoque e o controlador
        Estoque estoque = new Estoque();
        LojaController controller = new LojaController(estoque);

        // Criando clientes com diferentes métodos de notificação
        Cliente cliente1 = new Cliente("Alice", new NotificacaoEmail());
        Cliente cliente2 = new Cliente("Bob", new NotificacaoSMS());

        // Registrando clientes no estoque
        controller.registrarCliente(cliente1);
        controller.registrarCliente(cliente2);

        // Adicionando livros ao estoque
        Livro livro1 = new Livro("Java Básico", "Autor A", 2021, 50.0);
        Livro livro2 = new Livro("Design Patterns em Java", "Autor B", 2022, 75.0);

        controller.adicionarLivro(livro1);
        controller.adicionarLivro(livro2);

        // Buscando livro para notificar os clientes
        Livro livroBusca = new Livro("Java Básico", "", 0, 0);
        controller.buscarLivro(livroBusca);

        // Alterando método de notificação
        cliente1.setNotificacao(new NotificacaoSMS());
        controller.adicionarLivro(new Livro("Spring Framework", "Autor C", 2023, 100.0));
    }
}