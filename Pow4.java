import java.util.*;
public class Pow4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            if((2*(t&(t-1)))==0){
                System.out.println("Power of 4");
            }else{
                System.out.println("Not a power of 4");
            }
        }
    }
}