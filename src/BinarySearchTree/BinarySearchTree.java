package BinarySearchTree;

public class BinarySearchTree {
    public Node root;

    public void newNode(int data) {
        root = newNode(root, new Node(data));
    }
    private Node newNode(Node root, Node newData) {
        if (root == null) {
            root = newData;
            return root;
        }

        if (newData.data < root.data) {
            root.left = newNode(root.left, newData);
        } else {
            root.right = newNode(root.right, newData);
        }
        return root;
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.newNode(20);
        tree.newNode(2);
        tree.newNode(25);
        tree.newNode(37);
        tree.newNode(16);

        System.out.println("\nPre Order: ");
        tree.preOrder(tree.root);
        System.out.println("\nIn Order: ");
        tree.inOrder(tree.root);
        System.out.println("\nPost Order: ");
        tree.postOrder(tree.root);
    }
}

