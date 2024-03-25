public class BinaryTreeNode {
        private Object value;
        private BinaryTreeNode left;
        private BinaryTreeNode right;


        //initializes this node
        public BinaryTreeNode(Object value)
        {
             this.value = value;
        }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}

