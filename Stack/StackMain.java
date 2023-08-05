package Stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        // customStack Stack = new DynamicStack(5);
        // System.out.println(Stack.push(2));
        // System.out.println(Stack.push(3));
        // System.out.println(Stack.push(5));

        customStack Stack = new customStack();
        System.out.println(Stack.push(2));
        System.out.println(Stack.push(3));
        System.out.println(Stack.push(5));
    }


}
