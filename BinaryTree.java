class BinaryTree2<E> {
    private Node2<E> root;

    public BinaryTree2() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(E data) {
        root = insert(root, data);
    }
    
    private Node2<E> insert(Node2<E> node, E data) {
        if (node == null)
            node = new Node2<>(data);
        else {
            if (node.getLeft() == null)
                node.setLeft(insert(node.getLeft(), data));
            else
                node.setRight(insert(node.getRight(), data));
        }
        return node;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(Node2<E> r) {
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    public boolean search(E val) {
        return search(root, val);
    }

    private boolean search(Node2<E> r, E val) {
        if (r == null) return false;
        if (r.getData().equals(val))
            return true;
        return search(r.getLeft(), val) || search(r.getRight(), val);
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node2<E> r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node2<E> r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(Node2<E> r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}
