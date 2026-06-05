import java.net.Socket;

public class Push1 {
    int arr[]  = new int[5];
    int top=-1;
    void push(int data){
        if(top == arr.length-1){
            System.out.println("Stack overflow");
            return;
        }
        ++top;
        arr[top]=data;
        System.out.println(arr[top]+"->inserted");
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println(arr[top]+"->deleted");
        top--;
    }

    void peek(){
        if(top==-1){
            System.out.println("NO VALUES IN STACK");
            return;
        }
        System.out.println(arr[top]+"->IS PEEK ELEMENT");
    }
    boolean search(int data){
        if(top==-1){
            
            return false;
        }
        for(int i=0;i<=top;i++){
            if(arr[i]==data){
                return true;
            }
        }
        return false;
    }
    void display(){
        if(top==-1){
            System.out.println("NO ELEMENTS IN STACK");
            return;
        }
        for(int i=top;i>=0;i--){
            if(i==0)
                System.out.println(arr[i]);
            else
                System.out.print(arr[i]+"->");
        }
    }
    
    void count(){
        if(top==-1){
            System.out.println("NO ELEMENTS IN STACK");
            return;
        }int c=0;
        for(int i=top;i>=0;i--){
            c++;
        }
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        Push1 ps = new Push1();
        ps.push(90);
        ps.push(910);
        ps.push(11);
        ps.push(13);
        ps.push(14);
        ps.push(15);
        ps.pop();
        ps.pop();
        ps.peek();
        System.out.println(ps.search(90));
        ps.display();      
        ps.count();  
    }
}
