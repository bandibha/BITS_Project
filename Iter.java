import java.util.*;
public class Iter {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        Iterator s =s1.iterator();
        while (s.hasNext()) {
          System.out.println(s.next());  
        }
       
    }   
}
