import java.util.*;
public class Hash {
    public static void main(String[] args) {
       HashSet<Integer> hs = new HashSet<>();
       hs.add(1);
       hs.add(2);
       hs.add(3);
       System.out.println(hs);
       LinkedList<Integer> ll = new LinkedList<>(hs);
       System.out.println(ll);
    }
}
