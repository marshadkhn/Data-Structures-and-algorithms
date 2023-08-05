package Trees.BT;
//Using 2 collection frameworks
import java.util.LinkedList;
import java.util.Queue;
public class levelorder {
    //Class to represent tree node
    static class Node{
        int data;
        Node left,right;

        public Node(int item){
            data = item;
            left = null;
            right = null;
        }
    }

    //Class to print the level order
    static class levelBT{
        Node root;
        void printlevelorder(){
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node tempNode = queue.poll();
                System.out.print(tempNode.data + " | ");

                //Checking left child
                if(tempNode.left != null){
                    queue.add(tempNode.left);
                }

                if(tempNode.right != null){
                    queue.add(tempNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        //Creating level order
        levelBT LBT = new levelBT();
        LBT.root = new Node(1);
        LBT.root.left = new Node(2);
        LBT.root.right = new Node(3);

        System.out.println("Printing level order");
        LBT.printlevelorder();
    }
}
