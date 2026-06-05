import java.util.*;
public class Pow2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            if((t&(t-1))==0){
                System.out.println("Power of 2");
            }else{
                System.out.println("Not a power of 2");
            }
        }
    }
}
