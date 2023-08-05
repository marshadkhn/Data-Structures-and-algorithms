package collectionFrameworks.ListInterface;
import java.io.*;
import java.util.*;
public class Stack<I extends Number> {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(10);
    }

    private void push(I i) {
        System.out.print(i+ ", ");
    }
}
