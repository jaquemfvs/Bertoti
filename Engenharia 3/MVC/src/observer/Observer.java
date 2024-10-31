package observer;

import java.util.List;
import model.Livro;

public interface Observer {
    void update(List<Livro> livros);
}