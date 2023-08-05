import java.util.HashSet;

public class Basic {
    public static void main(String[] args) {
        //By usuing hashset
        HashSet<Integer> hash = new HashSet<Integer>();
        hash.add(2);
        hash.add(4);
        hash.add(7);
        System.out.println(hash);

        //Removing 4
        hash.remove(4);
        System.out.println(hash);

        if(hash.contains(2) == true) System.out.println("We got");
        else System.out.println("Nope");

        System.out.println(hash.size());
    }
}
