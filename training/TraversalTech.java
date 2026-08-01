public class TraversalTech {
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(15);
        tree.root.left = new Node(6);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(20);
        tree.root.left.left.left = new Node(10);
        tree.root.left.left.left.right = new Node(11);
        tree.root.left.left.left.right.left = new Node(18);
        tree.root.left.right = new Node(20);
        tree.root.left.right.right = new Node(27);
        tree.root.left.right.right.left = new Node(31);
        tree.root.left.right.right.left.right = new Node(42);
        tree.root.left.right.right.right = new Node(8);
        tree.root.left.right.right.right.right = new Node(3);

        System.out.print("Pre order : ");
        tree.preorder(tree.root);
        System.out.println();
        System.out.print("In order  : ");
        tree.inorder(tree.root);
        System.out.println();
        System.out.print("Post order: ");
        tree.postorder(tree.root);
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinaryTree{
    
    Node root;
    void postorder( Node node)
    {
        if( node==null)
        return;
        
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" -> ");
        
        
    }
    void inorder( Node node)
    {
        if( node==null)
        return;
        
        inorder(node.left);
        inorder(node.right);
        System.out.print(node.data+" -> ");
        
        
    }
    void preorder( Node node)
    {
        if( node==null)
        return;
        System.out.print(node.data+" -> ");
        preorder(node.left);
        preorder(node.right);
        
        
        
    }
}