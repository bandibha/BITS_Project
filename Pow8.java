import java.util.*;
public class Pow8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            if((4*(t&(t-1)))==0){
                System.out.println("Power of 8");
            }else{
                System.out.println("Not a power of 8");
            }
        }
    }
} 
    

