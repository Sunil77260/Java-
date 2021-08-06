package Tree;

import java.util.logging.SocketHandler;

public class trasveringOftree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node root =new Node(1);
        Node x1=new Node(2);
        Node x2=new Node(3);
        root.left=x1;
        root.right=x2;
        Node x3=new Node(4);
        Node x4=new Node(5);
        x1.left=x3;
        x1.right=x4;
        Node x5=new Node(6);
        Node x6=new Node(7);
        x2.left=x5;
        x2.right=x6;

        System.out.println("preorder");
        preOrder(root);
        System.out.println();
        System.out.println("inorder");
        inOrder(root);
        System.out.println();
        System.out.println("postorder");
        postOrder(root);
    }

    // pring the element in preorder in tree
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // method for printing the tree in inorder
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //pring the tree in postorder
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
