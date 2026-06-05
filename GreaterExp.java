import java.util.Scanner;

public class GreaterExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            if(n>18){
                throw new ArithmeticException("Your Eligible to work");
            }else{
            System.out.println("Your not Eligible to work");
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    

}

