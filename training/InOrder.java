class InOrder{
        public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.right=new Node(8);
        tree.root.left.left.right.left=new  Node(9);
        tree.root.right.left.right=new Node(10);
        tree.inorder(tree.root);
    }
}


class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTree{

    Node root;
    void inorder( Node node)
    {
        if( node==null)
        return;
        
        inorder(node.left);
        System.out.print(node.data+"->");
        inorder(node.right);
        
    }
}