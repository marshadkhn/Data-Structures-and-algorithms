//Insertion in BINARY TREE
//Creating tree with INORDER TRAVERSAL
//Inserting the new node with help of LEVEL ORDER
package Trees.BT;
import java.util.LinkedList;
import java.util.Queue;
public class insertion {
    //Node for tree
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    static Node root;
    static Node temp = root;

    //Inorder traversal for Insertion of binary tree
    static void inorder(Node temp){
        if(temp == null) return;
        inorder(temp.left);
        System.out.println(temp.data + " ");
        inorder(temp.right);
    }

    //Function for insertion
    static void insertion(Node temp, int data){
        if(temp == null){
            root = new Node(data);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        while(!q.isEmpty()){
            temp = q.peek();
            q.remove();

            if(temp.left == null){
                temp.left = new Node(data);
                break;
            }
            else q.add(temp.left);

            if(temp.right == null){
                temp.right = new Node(data);
            }
            else q.add(temp.right);
        }

    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.println("Inorder before insertion");
        inorder(root);

        int data = 12;
        insertion(root, data);
        System.out.println("After");
        inorder(root);

    }
}
