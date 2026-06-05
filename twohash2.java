import java.util.*;
public class twohash2 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        HashSet<Integer> s2 = new HashSet<>();
        s2.add(3);
        s2.add(5);
      
        System.out.println(s1.containsAll(s2));
    }   
}