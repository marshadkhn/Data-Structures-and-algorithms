 package Trees.BT;

import java.util.Scanner;

public class mainBT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 1 for InOrder");
         System.out.println("Enter 2 for PostOrder");
         System.out.println("Enter 3 for PreOrder");
         System.out.println("Enter 4 for levelorder");
         int data = sc.nextInt();
         treeCreation tree = new treeCreation();

//         switch (data) {
//             case 1:
//                 tree.printInorder();
//                 break;
//
//             case 2:
//                 tree.printPostorder();
//                 break;
//
//             case 3:
//                 tree.printPreorder();
//                 break;
//             default:
//                 break;

    }
}
