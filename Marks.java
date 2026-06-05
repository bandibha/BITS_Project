import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Marks {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the no.of Students:");
        int n = sc.nextInt();
       
        for(int i=0;i<n;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<5;j++){
                System.out.println("Enter the Subject Marks:");
                int submarks = sc.nextInt();
                arr.add(submarks);
            }int sum=0;
            for (int c : arr) {
             sum+=c;   
            }
            double avg = (double)sum/5;
            System.out.println(i+1 + " .Student Average is :"+avg);
        }
    }
}
