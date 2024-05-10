class Node2<E> {
    private Node2<E> left, right;
    private E data;

    public Node2() {
        this(null);
    }

    public Node2(E item) {
        left = null;
        right = null;
        data = item;
    }

    public void setLeft(Node2<E> n) {
        left = n;
    }

    public void setRight(Node2<E> n) {
        right = n;
    }

    public Node2<E> getLeft() {
        return left;
    }

    public Node2<E> getRight() {
        return right;
    }

    public void setData(E d) {
        data = d;
    }

    public E getData() {
        return data;
    }
}
