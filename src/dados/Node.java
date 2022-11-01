package dados;

public class Node<T> {
    private T value;
    private Node<T> prox;
    private Node<T> ant;

    public Node(T value) {
        this.value = value;
        this.prox = null;
        this.ant = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getProx() {
        return prox;
    }

    public void setProx(Node<T> prox) {
        this.prox = prox;
    }

    public Node<T> getAnt() {
        return ant;
    }

    public void setAnt(Node<T> ant) {
        this.ant = ant;
    }
}
