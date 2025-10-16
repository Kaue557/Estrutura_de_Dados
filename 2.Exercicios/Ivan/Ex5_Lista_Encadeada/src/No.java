public class No<T> {

    private T elemento;
    private No<T> proximo;

    // CONSTRUTOR PARA ELEMENTO
    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null; // NAO OBRIGATORIO
    }

    // CONSTRUTOR PARA ELEMENTO E PROXIMO
    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    // GETTER E SETTERS
    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
