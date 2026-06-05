public class Fibnoci{
    public static void main(String []args){
        int n=10;
        int a=0,b=1;
        System.out.println("Fibnoci series upto"+n+"terms");
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}