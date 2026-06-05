import java.util.*;
public class Insert1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        for(int i=1;i<n;i++){
            int j =i-1;
            int curr=arr[i];
            while (j>=0 && arr[j]>curr) //checking where we need to insert the element
            {
                arr[j+1]=arr[j];
                j--;
            }
           arr[j+1]=curr;//placing element
           System.out.println(Arrays.toString(arr));
           
        }
        
         
    }
}