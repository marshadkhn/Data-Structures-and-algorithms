package collectionFrameworks.ListInterface;
import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        // Empty linkedlist
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(8);
        ll.add(9);
        System.out.println(ll);
        System.out.println("After insertion");
        ll.addFirst(0);
        System.out.println(ll);
        System.out.println("After deletion");
        ll.removeLast();
        System.out.println(ll);

    }
}
