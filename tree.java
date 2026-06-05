import java.util.*;
public class tree {
    public static void main(String[] args) {
       TreeSet<Integer> ts = new TreeSet<>();
       ts.add(1);
       ts.add(2);
       ts.add(3);
       System.out.println(ts);
       LinkedList<Integer> ll = new LinkedList<>(ts);
       System.out.println(ll);
    }
}

