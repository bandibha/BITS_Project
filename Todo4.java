import java.util.*;

public class Todo4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(99);
        System.out.println(ll);
        ll.addFirst(89);
        System.out.println(ll);
        ll.addLast(909);
        System.out.println(ll);
        ll.offer(11);
        System.out.println(ll);
        ll.offerFirst(13);
        System.out.println(ll);
        ll.offerLast(14);
        System.out.println(ll);
        ll.get(4);
        System.out.println(ll);

    }
}

