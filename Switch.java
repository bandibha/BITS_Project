import java.util.Scanner;
public class Switch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values:");
        int a,b;

        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter operators:");
        char operator = sc.next().charAt(0);
       
        switch (operator){
            case '+':
                System.out.println("Sum is"+(a+b));
                break;
           case '-':
                System.out.println("Sub is"+(a-b));
                break;
          case '*':
                System.out.println("mul is"+(a*b));
                break;
            case '%':
                System.out.println("mod is"+(a%b));
                break;
            case '/':
                System.out.println("div is"+(a/b));
                break;
            default:
                System.out.println("Invalid operator");
                
        }
    }
}
