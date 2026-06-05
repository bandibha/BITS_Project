import java.util.*;
public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Nikki", 23);
        map.put("Vasu", 53);
        map.put("Sindhu", 26);
        map.put("Bandi", 14);
        for(String c : map.keySet()){
            if(map.get(c)==23)
            {
                System.out.println(c);
            }
        }
    }
}
