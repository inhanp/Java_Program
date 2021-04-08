public class BinaryTree<T> {

    private T element;
    private BinaryTree<T> left;
    private BinaryTree<T> right;

    /**
     * BinaryTree object
     * @param value Element that BinaryTree object contains
     */
    public BinaryTree(T value) {
        this.element = value;
        this.left = null;
        this.right = null;
    }

    /**
     * Initialize BinaryTree with its left child and right child object
     * @param value         element that this object contain
     * @param leftChild     Left child object
     * @param rightChild    Right child object
     */
    public BinaryTree(T value, BinaryTree<T> leftChild, BinaryTree<T> rightChild) {
        this.element = value;
        this.left = leftChild;
        this.right = rightChild;
    }

    /**
     * Get element of an object
     * @return  element of object
     */
    public T getElement() {
        return this.element;
    }

    /**
     * Set element of object
     * @param value T value to set as element
     */
    public void setElement(T value) {
        this.element = value;
    }

    /**
     * Get left child of current object
     * @return  left child
     */
    public BinaryTree<T> getLeft() {
        return left;
    }

    /**
     * Set left child of current object
     * @param subtree   object to set as left child
     */
    public void setLeft(BinaryTree<T> subtree) {
        left = subtree;
    }

    /**
     * Get right child of current object
     * @return  right child
     */
    public BinaryTree<T> getRight() {
        return this.right;
    }

    /**
     * Set right child of current object
     * @param subtree   object to set as right child
     */
    public void setRight(BinaryTree<T> subtree) {
        this.right = subtree;
    }

    /**
     * Return size of current tree
     * @return  size of tree
     */
    public int size() {
        //Base case: current node has 0 children
        //Recursive Case 1: current node has 1 child on the left
        //Recursive Case 2: current node has 1 child on the right
        //Recursive Case 3: current node has 2 children
        int size = 1;
        if (this.getLeft() != null) {
            size += this.getLeft().size();
        }
        if (this.getRight() != null) {
            size += this.getRight().size();
        }
        return size;
    }

    /**
     * Return height of tree
     * @return  height of tree
     */
    public int height() {
        int height = 1;
        int leftHeight = 0;
        int rightHeight = 0;
        //Base case: current node has 0 children
        //Recursive case 1: current node has 1 child on the left
        //Recursive Case 2: current node has 1 child on the right
        if (this.getLeft() != null) {
            leftHeight += this.getLeft().height();
        }
        if (this.getRight() != null) {
            rightHeight += this.getRight().height();
        }
        
        return height + Math.max(leftHeight, rightHeight);
    }

    /**
     * List element of tree in preorder.
     * @return  list of elements
     */
    public String toPreOrderString() {
        StringBuilder string = new StringBuilder();
        string.append("(");
        string.append(this.getElement());
        if (this.getLeft() != null) {
            string.append(this.getLeft().toPreOrderString());
        }
        if (this.getRight() != null) {
            string.append(this.getRight().toPreOrderString());
        }
        string.append(")");
        return string.toString();
    }

    /**
     * List element of tree in inorder
     * @return  list of elements
     */
    public String toInOrderString() {
        StringBuilder string = new StringBuilder();
        string.append("(");
        if (this.getLeft() != null) {
            string.append(this.getLeft().toInOrderString());
        }
        string.append(this.getElement());
        if (this.getRight() != null) {
            string.append(this.getRight().toInOrderString());
        }
        string.append(")");
        return string.toString();
    }

    /**
     * List element of tree in postorder
     * @return  list of elements
     */
    public String toPostOrderString() {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        if (left != null)
        {
            builder.append(left.toPostOrderString());
        }
        if (right != null)
        {
            builder.append(right.toPostOrderString());
        }
        builder.append(element);
        builder.append(")");

        return builder.toString();
    }

    public static void main(String[] args) throws Exception {
        BinaryTree<String> current = new BinaryTree<String>("origin");
        BinaryTree<String> left = new BinaryTree<String>("left");
        BinaryTree<String> right = new BinaryTree<String>("right");
        assert current.size() == 1;
        current.setLeft(left);
        assert current.size() == 2;
        current.setRight(right);
        assert current.size() == 3;
        System.out.println(current.toInOrderString());
        System.out.println(current.toPreOrderString());
        System.out.println(current.toPostOrderString());
    }
}
