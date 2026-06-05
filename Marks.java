import java.util.Scanner;
public class Marks{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int s1,s2,s3,s4,s5;
        String grade;

        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        s4=sc.nextInt();
        s5=sc.nextInt();

        int total=s1+s2+s3+s4+s5;
        double percentage=(total/500.0)*100;
        System.out.println("Total:"+total);
        System.out.println("Percentage:"+percentage);

        switch ((int) percentage/10){
            case 10:
                grade = "O";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
        }
        System.out.println("Grade:"+grade);
    }
}
