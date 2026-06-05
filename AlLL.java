import java.util.*;

public class AlLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> emd = new ArrayList<>();
        emd.add("AJAY");
        emd.add("BB");
        LinkedHashSet<String> lhs = new LinkedHashSet<>(emd);
        System.out.println(lhs);
    }
}
