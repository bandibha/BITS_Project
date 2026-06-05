import java.util.Scanner;

public class NumStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        boolean containsNumber = false;
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            containsNumber = false;
            for(char c:s.toCharArray()){
                if(Character.isDigit(c)){
                    containsNumber = true;
                    break;
                }
            }

        }
        System.out.println(containsNumber);
        
        

    }    
}
