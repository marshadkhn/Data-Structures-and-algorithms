package Trees.BT;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        this.data = item;
        this.left = null;
        this.right = null;
    }
}

class treeCreation{
    public static Node creation(){
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter value");
        System.out.println("Enter -1 if there is no value");
        int data = sc.nextInt();
        
        if (data == -1) {
            return null;                                   //If there is no child
        }

        root = new Node(data);
        System.out.println("Enter left child of " + data);
        root.left = creation();
        System.out.println("Enter right child of " + data);
        root.right = creation();
        return root;

    }

    //Inorder [LNR]
    void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " | ");
        printInorder(root.right);
    }

    //Preorder traversal [NLR]
    void printPreorder(Node root){
        if (root == null) return;
        System.out.println(root.data+ " | ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    //Postorder [LRN]
    void printPostorder(Node root){
        if (root == null) return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.println(root.data+" | ");
    }

}



