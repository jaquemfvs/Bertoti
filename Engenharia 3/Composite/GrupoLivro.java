import java.util.ArrayList;
import java.util.Iterator;

public class GrupoLivro implements ComponentLivro {

    ArrayList<ComponentLivro> componentsLivro = new ArrayList<>();
    String nomeGrupo;
    String descricaoGrupo;

    public GrupoLivro(String newNomeGrupo, String newDescricaoGrupo) {
        nomeGrupo = newNomeGrupo;
        descricaoGrupo = newDescricaoGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public String getDescricaoGrupo() {
        return descricaoGrupo;
    }

    public void add(ComponentLivro newComponentLivro) {
        componentsLivro.add(newComponentLivro);
    }

    public void remove(ComponentLivro newComponentLivro) {
        componentsLivro.remove(newComponentLivro);
    }

    public ComponentLivro getComponent(int componentIndex) {
        return componentsLivro.get(componentIndex);
    }

    public void displayInfoLivro() {
        System.out.println(getNomeGrupo() + " " + getDescricaoGrupo() + "\n");

        Iterator<ComponentLivro> livroIterator = componentsLivro.iterator();

        while (livroIterator.hasNext()) {
            ComponentLivro infoLivro = livroIterator.next();
            infoLivro.displayInfoLivro();
        }
    }
}