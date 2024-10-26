public class DiscJockey {
    ComponentLivro listaLivro;
  
    public DiscJockey(ComponentLivro newListaLivro) {
        listaLivro = newListaLivro;
    }
  
    public void getListaLivro(){
        listaLivro.displayInfoLivro();
    }
  }