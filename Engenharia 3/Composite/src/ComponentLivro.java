public interface ComponentLivro {
    default void add(ComponentLivro componentLivro){
        throw new UnsupportedOperationException();
    }

    private void remove(ComponentLivro newComponentLivro){
        throw new UnsupportedOperationException();
    }

    private ComponentLivro getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }

    private String getNomeLivro(){
        throw new UnsupportedOperationException();
    }

    private String getNomeSaga(){
        throw new UnsupportedOperationException();
    }

    private int getAnoLancamento(){
        throw new UnsupportedOperationException();
    }

    default void displayInfoLivro(){
        System.out.println("Nome do Livro: " + getNomeLivro());
        System.out.println("Saga: " + getNomeSaga());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
    }
}