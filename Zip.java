import java.util.Scanner;
public class Zip{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("zoom");
        }else if(n%5==0){
            System.out.println("Zap");
        }else if(n%3==0){
            System.out.println("Zip");
        }else{
            System.out.println("Better luck next time");
        }
   
    }
}