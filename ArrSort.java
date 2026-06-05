import java.util.*;


public class ArrSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int ArrLisSize = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<ArrLisSize;i++){
                int val = sc.nextInt();
                arr.add(val);
            }
            Collections.sort(arr);
            System.out.println(arr);
        }

       
    }    
}


